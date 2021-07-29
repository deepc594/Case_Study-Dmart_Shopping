package com.dmart.dao;

import java.util.ArrayList;
import java.util.List;

import com.dmart.entity.Product;

public class ImplProductDao implements iProductDao {
	List<Product> prdList = new ArrayList<Product>();

	@Override
	public String addProduct(Product p) {
		prdList.add(p);

		return "Product Added";
	}

	@Override
	public List<Product> getAllProducts() {
		return prdList;
	}

}
