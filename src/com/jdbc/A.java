package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.util.Scanner;

// PL-SQL
import com.mysql.jdbc.Driver;

public class A {

		// JDBC is an API (Application Programming Interface).
	// API contains interfaces using which programmer writes program

	

		public static void main(String[] args) {

			try {
				Scanner sc = new Scanner(System.in);

				DriverManager.registerDriver(new Driver());

				String url;
				String user;
				String password;
				// 1
				Connection c = DriverManager.getConnection(url = "jdbc:mysql://localhost:3306/test","root","root");
				
				System.out.println("Connection established");

				// c===>[ prepareStatement() ] Connection object

				
				PreparedStatement ps = c.prepareStatement("select rno from Role where marks=(select min(marks) as agg from student)");

				// ps===> [ executeQuery() setInt() ] PreparedStatement object

				// rno marks
				// rs--> 2 80
				// 1 90

				// Resultset Object

				ResultSet rs = ps.executeQuery();

				for (; rs.next();)

					System.out.println(rs.getInt("rno") );
				

			}

			catch (Exception e) {
				e.printStackTrace();
			}

		}// main ends

	}





