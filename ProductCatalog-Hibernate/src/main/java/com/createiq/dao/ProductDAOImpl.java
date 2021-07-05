package com.createiq.dao;

import java.util.List;

import org.hibernate.Session;

import com.createiq.model.Product;
import com.createiq.util.SessionUtil;

public class ProductDAOImpl implements ProductDAO {

	public void add(Product product) {
		Session session = SessionUtil.openSession();
		session.save(product);
		session.beginTransaction().commit();
		SessionUtil.close(session);
	}

	public void update(Product product) {
		Session session = SessionUtil.openSession();
		session.update(product);
		session.beginTransaction().commit();
		SessionUtil.close(session);

	}

	public void delete(Integer pid) {
		Session session = SessionUtil.openSession();
		Product product = new Product();
		product.setPid(pid);
		session.delete(product);
		session.getTransaction().commit();
		SessionUtil.close(session);
	}

	public Product findById(Integer pid) {
		return (Product) SessionUtil.openSession().get(Product.class, pid);
	}

	public List<Product> findAll() {
		return SessionUtil.openSession().createQuery("from Product").list();
	}

	public static void main(String[] args) {

		ProductDAO productDAO = new ProductDAOImpl();
		// Product product = new Product(1010, "Product10", 5000.00);
		// productDAO.add(product);
		// System.out.println("Success");

		System.out.println(productDAO.findById(1001));

	}

}
