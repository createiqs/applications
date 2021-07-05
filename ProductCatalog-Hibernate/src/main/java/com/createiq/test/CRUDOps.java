package com.createiq.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.createiq.quaries.Queries;

public class CRUDOps {

	public static void add() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcatalog", "root", "root");
			PreparedStatement statement = con.prepareStatement(Queries.INSERT);
			statement.setInt(1, 1003);
			statement.setString(2, "Test");
			statement.setDouble(3, 25000.00);
			statement.executeUpdate();
			System.out.println("Inserted Successfully....");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void delete() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcatalog", "root", "root");
			PreparedStatement statement = con.prepareStatement(Queries.DELETE_BY_ID);
			statement.setInt(1, 1003);
			statement.executeUpdate();
			System.out.println("Deleted Successfully....");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void update() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcatalog", "root", "root");
			PreparedStatement statement = con.prepareStatement(Queries.UPDATE);
			statement.setInt(1, 1003);
			statement.executeUpdate();
			System.out.println("Updated Successfully....");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void findById() {

	}

	public void findAll() {

	}
	
	public static void main(String[] args) {
		delete();
	}

}
