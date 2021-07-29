package com.dmart.service;

import java.util.ArrayList;
import java.util.List;

import com.dmart.dao.ImplProductDao;
import com.dmart.dao.iProductDao;
import com.dmart.entity.Product;

public class ImplProductService implements iProduct {

	List<Product> prdList = new ArrayList<Product>();
	iProductDao dao=new ImplProductDao();
	@Override
	public String addProduct(Product p) {

		String msg=dao.addProduct(p);
		return msg;
		//prdList.add(p);
		//return "Product Added";
		// System.out.println("Adding Product" + prdList);

	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> prdList=dao.getAllProducts();
		return prdList;
	}

}
