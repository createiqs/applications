package com.createiq.dao;

import java.util.List;

import com.createiq.model.Product;

public interface ProductDAO {
	void add(Product product);

	void update(Product product);

	void delete(Integer pid);

	Product findById(Integer pid);

	List<Product> findAll();
}
