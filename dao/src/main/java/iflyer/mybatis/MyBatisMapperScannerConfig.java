package iflyer.mybatis;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * [Todo...]
 * Created by 胡龙宾<Vivian> on 2017/8/4.
 */
@Configuration
@ImportResource(locations={"classpath:spring-config/spring-datasource.xml"})
// 因为这个对象的扫描，需要在MyBatisConfig的后面注入，所以加上下面的注解
@AutoConfigureAfter(MybatisConfig.class)
public class MyBatisMapperScannerConfig {
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		//获取之前注入的beanName为sqlSessionFactory的对象
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		//指定xml配置文件的路径
		mapperScannerConfigurer.setBasePackage("classpath:mapper/*.xml");
		return mapperScannerConfigurer;
	}


}