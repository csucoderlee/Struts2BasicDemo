package org.csu.lee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.csu.lee.dao.ProductDAO;
import org.csu.lee.entity.Product;
import org.csu.lee.util.DBUtil;

public class ProductDAOImpl implements ProductDAO {

	private static final String SELECTALL_SQL = "select * from the product";

	@Override
	public List<Product> showAllProduct() throws Exception {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		try {
			con = DBUtil.getConnection();
			pst = con.prepareStatement(SELECTALL_SQL);
			rst = pst.executeQuery();
			while (rst.next()) {
				Product product = new Product();
				product.setProduct_id(rst.getInt(1));
				product.setProduct_name(rst.getString(2));
				product.setProduct_price(rst.getDouble(3));
				product.setProduct_description(rst.getString(4));
				list.add(product);
			}
		} finally {
			DBUtil.closeResultSet(rst);
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeConnection(con);
		}
		return list;
	}
}
