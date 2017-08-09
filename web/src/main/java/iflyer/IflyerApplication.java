package iflyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Vivian on 17/8/06.
 */
@EnableEurekaServer
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class IflyerApplication {

    protected static Logger logger=LoggerFactory.getLogger(IflyerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(IflyerApplication.class, args);
        logger.info("SpringBoot Start Success");
    }
}
