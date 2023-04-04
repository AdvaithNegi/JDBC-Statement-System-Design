package com.jsp.teacher.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {

	String url = "jdbc:mysql://localhost:3306/jdbc_demo";
	String username = "root";
	String password = "root";
	Connection connection = null;

	public Connection getConnection() {

		try {
			// Load or Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish Connection
			connection = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;

	}

}
