package com.createiq.service;

import java.util.List;

import com.createiq.dao.ProductDAO;
import com.createiq.dao.ProductDAOImpl;
import com.createiq.model.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDAO productDAO = new ProductDAOImpl();

	public void add(Product product) {
		productDAO.add(product);
	}

	public void update(Product product) {
		productDAO.update(product);

	}

	public void delete(Integer pid) {
		productDAO.delete(pid);

	}

	public Product findById(Integer pid) {
		return productDAO.findById(pid);
	}

	public List<Product> findAll() {
		return productDAO.findAll();
	}

}
