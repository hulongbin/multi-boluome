package iflyer.dao;

import iflyer.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liuxin on 17/1/20.
 * 此类提供两个方法
 * 1.保存用户
 * 2.根据用户名得到用户info
 */
@Component
public class UserDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	//@Insert("insert into t_user(username,age) values(#{userName,jdbcType=VARCHAR},#{age,jdbcType=INTEGER})")
	public User save(User user) {
		this.sqlSessionTemplate.insert("save", user);
		return user;
	}

	//@Select("select * from t_user where id = #{id,jdbcType=INTEGER}")
	public User selectById(Integer id) {
		return this.sqlSessionTemplate.selectOne("selectById", id);
	}

//	int updateById(User user);
//
//	int deleteById(Integer id);
//
	public List<User> queryAll() {
		List<User> queryAll = this.sqlSessionTemplate.selectList("queryAll");
		return queryAll;
	}

}




