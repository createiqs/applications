package com.createiq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.createiq.model.Product;
import com.createiq.quaries.Queries;
import com.createiq.util.ConnectionUtil;

public class ProductDAOImpl implements ProductDAO {

	public void add(Product product) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(Queries.INSERT);
			st.setInt(1, product.getPid());
			st.setString(2, product.getPname());
			st.setDouble(3, product.getPcost());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
          ConnectionUtil.close(st, connection);
		}
	}

	public void update(Product product) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(Queries.UPDATE);
			st.setInt(3, product.getPid());
			st.setString(1, product.getPname());
			st.setDouble(2, product.getPcost());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
          ConnectionUtil.close(st, connection);
		}

	}

	public void delete(Integer pid) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(Queries.DELETE_BY_ID);
			st.setInt(1, pid);
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
          ConnectionUtil.close(st, connection);
		}

	}

	public Product findById(Integer pid) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = connection.prepareStatement(Queries.FIND_BY_ID);
			st.setInt(1, pid);
			rs = st.executeQuery();
			Product product =  new Product();
			if(rs.next()) {
				product.setPid(rs.getInt("pid"));
				product.setPname(rs.getString("pname"));
				product.setPcost(rs.getDouble("pcost"));
			}
			return product;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
          ConnectionUtil.close(rs,st, connection);
		}
		return null;
	}

	public List<Product> findAll() {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = connection.prepareStatement(Queries.FIND_ALL);
			rs = st.executeQuery();
			List<Product> products = new ArrayList<Product>();
			while(rs.next()) {
				Product product = new Product();
				product.setPid(rs.getInt("pid"));
				product.setPname(rs.getString("pname"));
				product.setPcost(rs.getDouble("pcost"));
				products.add(product);
			}
			return products;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
          ConnectionUtil.close(st, connection);
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		
		ProductDAO productDAO =  new ProductDAOImpl();
//		Product product =  new Product(1010, "Product10", 5000.00);
//		productDAO.add(product);
//		System.out.println("Success");
		
		System.out.println(productDAO.findById(1001));
		
	}

}
