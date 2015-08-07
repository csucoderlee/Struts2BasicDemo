package org.csu.lee.service;

import java.util.List;

import org.csu.lee.dao.impl.UserDAOImpl;
import org.csu.lee.entity.User;

/**
 * 
 * @author csucoderlee
 * Description : 业务处理类，与数据库操作，实现用户注册，登录过程，
 */
public class UserService {
	
	private UserDAOImpl userdaoimpl= null;
	public UserService(){
		userdaoimpl = new UserDAOImpl();            //构造注入
	}
	//向数据库中插入新的user信息
	public boolean addUser(User user) throws Exception{
		return userdaoimpl.add(user);
	}
	public boolean updateUser(User user) throws Exception{
		return userdaoimpl.update(user);
	}
	public boolean deleteUser(User user) throws Exception{
		return userdaoimpl.delete(user);
	}
	public List<User> showUser() throws Exception{
		return userdaoimpl.select();
	}
	public boolean selectByUsernameAndPassword(User user) throws Exception{
		return userdaoimpl.selectByUsernameAndPassword(user);
	}
}
