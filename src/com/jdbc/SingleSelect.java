package com.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

// JDBC is an API 
// Every API contains certain classes and interfaces using which developer develop applications . e.g. using JDBC API , java developers develop database application
// JDBC API contains classses like DriverManager , Types
// JDBC API contains interfaces like Connection , PreparedStatement , Statement , ResultSet
// JDBC is used to connect to database from Java programs
// using JDBC , we execute SQL Queries inside java programs.
// Driver class is like translator which establishes communication between java program and database .

//   [Java program]       Driver class         [] Database

// If we use any class , which is not present in JDK/JRE then we need to add jar file , which contains that class , in a  build path
// Driver class is not present in JDK .It means we need to mySQL-connector.jar file into build path . This jar file contains Driver class
// Jar file contains class


public class SingleSelect {


	
	public static void main(String[] args) throws Exception {
				
		
		DriverManager.registerDriver(new Driver()); // informing java that we want to connect to mySQL database
		
		String url;
		String userName;
		String password;
		
		//Student     s  = A . getStudent();
		
		Connection con = DriverManager.getConnection(url="jdbc:mysql://localhost:3306/test" , userName="root" , password="root");
		
		PreparedStatement ps = con.prepareStatement("select * from student8  where rno=?");// ps =>   [execute() , setInt() , setString()] PreparedStatement object
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter roll number :- ");
		
		int r=scanner.nextInt();
			
						
		ps.setInt(1, r);                             //   							rno  marks    name
													//  					rs==>	1    70     suyog
													//     							ResultSet object
		
						
		ResultSet rs =ps.executeQuery();  //  rs === >  [ next(),getInt(),getString() ] ResultSet object
	
		
		rs.next();  // next() brings resultset pointer to next record
		
		System.out.println(rs.getInt("marks"));
		
		System.out.println(rs.getString("name"));
		
	
		
		
	
		
		
		
		
		
	}
}








