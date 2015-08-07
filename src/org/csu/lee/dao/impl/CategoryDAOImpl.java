package org.csu.lee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.csu.lee.dao.CategoryDAO;
import org.csu.lee.entity.Category;
import org.csu.lee.util.DBUtil;

public class CategoryDAOImpl implements CategoryDAO {

	private final static String SELECT_SQL = "select * from category";

	@Override
	public List<Category> showCategory() throws Exception {
		// TODO Auto-generated method stub
		List<Category> list = new ArrayList();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		try {
			con = DBUtil.getConnection();
			pst = con.prepareStatement(SELECT_SQL);
			rst = pst.executeQuery();
			while(rst.next()){
				Category category = new Category();
				category.setCategory_name(rst.getString("category_name"));
				list.add(category);
			}
		} finally {
			DBUtil.closeResultSet(rst);
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeConnection(con);
		}
		return list;
	}
}
