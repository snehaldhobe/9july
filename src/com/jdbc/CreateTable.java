package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Driver;

public class CreateTable {

	


	public static void main(String[] args) throws Exception {
					
			
			DriverManager.registerDriver(new Driver()); // informing java that we want to connect to mySQL database
			
			String url;
			String userName;
			String password;
			
			//Student     s  = A . getStudent();
			
			Connection con = DriverManager.getConnection(url="jdbc:mysql://localhost:3306/test" , userName="root" , password="root");
			
			PreparedStatement ps = con.prepareStatement("create table Role(rno int,marks int,name varchar(20))");
			
			ps.execute();
			
			
			System.out.println("Table is created");
			
			
	}
	}

