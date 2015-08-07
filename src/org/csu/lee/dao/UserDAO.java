package org.csu.lee.dao;

import java.util.List;

import org.csu.lee.entity.User;

public interface UserDAO {

	// 增
	public boolean add(User user) throws Exception;

	// 删
	public boolean delete(User user) throws Exception;
	
	//改
	public boolean update(User user) throws Exception;
	
	//查，显示所有用户的信息
	public List<User> select() throws Exception;
	
	//网页输入的用户账户和密码，是否在数据库中存在，如果存在，可以登录
	public boolean selectByUsernameAndPassword(User user) throws Exception;
}
