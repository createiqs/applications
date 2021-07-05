package com.createiq.daotest;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.createiq.dao.ProductDAO;
import com.createiq.dao.ProductDAOImpl;
import com.createiq.model.Product;

public class ProductDAOTest {

	private static ProductDAO productDAO = null;

	@BeforeClass
	public static void init() {
		productDAO = new ProductDAOImpl();
	}

	@Test
	@Ignore
	public void insertTest() {
		Product product = new Product();
		product.setPid(1003);
		product.setPname("Test");
		product.setPcost(3000.00);
		productDAO.add(product);
	}

	public void updateTest() {

	}

	@Test(timeout=10)
	public void deleteTest() {
		productDAO.delete(1003);
	}

	public void findAllTest() {

	}

	@Test
	public void findByIdTest() {
		Product product = productDAO.findById(1001);
		assertEquals("TV", product.getPname());
	}

}
