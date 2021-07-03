package com.createiq.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.model.Product;
import com.createiq.service.ProductService;
import com.createiq.service.ProductServiceImpl;

/**
 * Servlet implementation class FindAllProductsController
 */
public class FindAllProductsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Find All Controller Called...  ");

		ProductService productService = new ProductServiceImpl();
		List<Product> products = productService.findAll();
		req.setAttribute("products", products);
		req.getRequestDispatcher("findAll.jsp").forward(req, resp);

	}

}
