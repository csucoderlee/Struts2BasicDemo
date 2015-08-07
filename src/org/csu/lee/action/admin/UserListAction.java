package org.csu.lee.action.admin;

import java.util.List;

import org.csu.lee.action.base.BaseAction;
import org.csu.lee.entity.User;
import org.csu.lee.service.UserService;

public class UserListAction extends BaseAction {

	private UserService userservice;

	public UserListAction() {
		this.userservice = new UserService();
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		List<User> list = userservice.showUser();
		request.setAttribute("userlist", list);
		return SUCCESS;
	}
}
