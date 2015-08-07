package org.csu.lee.dao;

import java.util.List;

import org.csu.lee.entity.Product;

public interface ProductDAO {

	// 展示所有商品信息，对应select all语句
	public List<Product> showAllProduct() throws Exception;

}
