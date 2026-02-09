package com.jdbc.establishconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionBasic {

	// Database credentials
	public static final String URL = "jdbc:mysql://localhost:3306/jdbc_practice";
	public static final String USER = "root";
	public static final String PASSWORD = "savi2026";

	public static Connection getConnection() {
		Connection connection = null;

		try {
			// 1- loading drivers
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2- create connection
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Database Connected Successfully!");

		} catch (ClassNotFoundException e) {
			System.err.println("MySQL JDBC Driver not found!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Connection failed!");
			e.printStackTrace();
		}

		return connection;
	}

	public static void main(String[] args) {

		Connection conn = getConnection();

		if (conn != null) {

			try {
				conn.close();
				System.out.println("Connection closed!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
