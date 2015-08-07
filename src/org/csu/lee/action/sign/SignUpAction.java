package org.csu.lee.action.sign;

import org.csu.lee.entity.User;
import org.csu.lee.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author csucoderlee Description : 这个类使用来作为控制层，进行用户注册的action类
 */
public class SignUpAction extends ActionSupport {

	private User user;
	private UserService userservice;

	public SignUpAction() {
		this.userservice = new UserService();
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		boolean flag = (userservice.addUser(user));
		if (flag)
			return SUCCESS;
		else
			return ERROR;

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
