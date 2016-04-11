package demo.dao;

import org.apache.ibatis.annotations.Param;

import demo.model.User;

public interface UserMapper {

	/**
	 * 访问数据库，检查用户名和密码输入是否正确。
	 * @param username
	 * @param password
	 * @return
	 */
	public User check(@Param("username") String username, @Param("password") String password);
}
