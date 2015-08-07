package org.csu.lee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.csu.lee.dao.UserDAO;
import org.csu.lee.entity.User;
import org.csu.lee.util.DBUtil;

public class UserDAOImpl implements UserDAO {

	// 增
	private static final String ADD_SQL = "insert into user(id,username,password) values(null,?,?)";

	// 删
	private static final String DELETE_SQL = "delete from user where username=? ";

	// 改
	private static final String UPDATE_SQL = "update user set password=? where username=? ";

	// 查
	private static final String SELECT_SQL = "select * from user";
	
	//
	private static final String SELECTBYUSERNAMEANDPASSWORD = "select * from user where username=?and password=?";

	// 注册时，向数据库中插入数据
	@Override
	public boolean add(User user) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = true;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DBUtil.getConnection();
			pst = con.prepareStatement(ADD_SQL);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			int i = pst.executeUpdate();
			if (i == 0)
				flag = false;
		} finally {
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeConnection(con);
		}
		return flag;
	}

	// 删除一个用户的信息
	@Override
	public boolean delete(User user) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = true;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DBUtil.getConnection();
			pst = con.prepareStatement(DELETE_SQL);
			pst.setString(1, user.getUsername());
			int i = pst.executeUpdate();
			if (i == 0)
				flag = false;
		} finally {
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeConnection(con);
		}
		return flag;
	}

	// 修改一个用户的信息
	@Override
	public boolean update(User user) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = true;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DBUtil.getConnection();
			pst = con.prepareStatement(UPDATE_SQL);
			pst.setString(1, user.getPassword());
			pst.setString(2, user.getUsername());
			int i = pst.executeUpdate();
			if (i == 0) {
				flag = false;
			}
		} finally {
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeConnection(con);
		}
		return flag;
	}

	// 登录时 ，判断是否存在该登录用户
	@Override
	public List<User> select() throws Exception {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnection();
			pst = con.prepareStatement(SELECT_SQL);
			rs = pst.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				System.out.println(user);
				list.add(user);
			}
		} finally {
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeResultSet(rs);
			DBUtil.closeConnection(con);
		}
		return list;
	}

	@Override
	public boolean selectByUsernameAndPassword(User user) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = true;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnection();
			pst = con.prepareStatement(SELECTBYUSERNAMEANDPASSWORD);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			rs = pst.executeQuery();
			if(!rs.next()){
				flag = false;
			}
		} finally {
			DBUtil.closeResultSet(rs);
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeConnection(con);
		}
		return flag;
	}
}
