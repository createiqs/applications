package com.createiq.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.model.Product;
import com.createiq.service.ProductService;
import com.createiq.service.ProductServiceImpl;

/**
 * Servlet implementation class UpdateProductController
 */
public class UpdateProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer pid = Integer.parseInt(request.getParameter("pid"));
		ProductService productService = new ProductServiceImpl();
		Product product = productService.findById(pid);
		request.setAttribute("product", product);
		request.getRequestDispatcher("./update.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer pid = Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		Double pcost = Double.parseDouble(request.getParameter("pcost"));
		Product product = new Product(pid, pname, pcost);
		ProductService productService = new ProductServiceImpl();
		productService.update(product);
		request.setAttribute("successMsg", "Product Updated Success fully with Product Id : "+pid);
		request.getRequestDispatcher("./findAll").forward(request, response);
	}

}
