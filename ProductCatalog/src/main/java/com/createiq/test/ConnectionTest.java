package com.createiq.test;

import java.sql.Connection;
import java.sql.DriverManager;

import com.createiq.util.ConnectionUtil;

public class ConnectionTest {
	
	public static void main(String[] args) {
		System.out.println(ConnectionUtil.getConnection());
	}
}

