package com.createiq.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.service.ProductService;
import com.createiq.service.ProductServiceImpl;

/**
 * Servlet implementation class DeleteProductController
 */
public class DeleteProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer pid = Integer.parseInt(request.getParameter("pid"));
		ProductService productService = new ProductServiceImpl();
		productService.delete(pid);
		request.setAttribute("deleteMsg", "Product Deleted Success fully with Product Id : "+pid);
		request.getRequestDispatcher("./findAll").forward(request, response);
	}


}
