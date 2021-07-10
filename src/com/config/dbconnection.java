package com.config;
import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {
	
	
		private static Connection connection = null;

		public static Connection getConnection() {

			try {
				// load driver
				Class.forName("com.mysql.jdbc.Driver");

				// create connection
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return connection;

		}

	}


