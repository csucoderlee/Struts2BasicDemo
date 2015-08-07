package org.csu.lee.action.sign;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.csu.lee.entity.User;
import org.csu.lee.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class SignInAction extends ActionSupport implements SessionAware {

	private User user;
	private UserService userservice;
	private Map<String, Object> session;

	public SignInAction() {
		this.userservice = new UserService();
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		boolean flag = userservice.selectByUsernameAndPassword(user);
		if (flag) {
			session.put("user_session",user);
			return SUCCESS;
		} else
			return ERROR;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}
}
