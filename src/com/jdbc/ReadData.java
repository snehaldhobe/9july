package com.jdbc;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadData {
	public static void main(String[] args) throws Exception
	{
		
		DriverManager.registerDriver(new Driver());	

		

		String url;
		String user;
		String password;
		
		
		FileInputStream fis = new FileInputStream("Workbook.xls");
		Workbook wb= Workbook.getWorkbook(fis);
		Sheet sh= wb.getSheet("login");
		
		Connection c = DriverManager.getConnection(url = "jdbc:mysql://localhost:3306/test","root","root");
		
		
		
		PreparedStatement ps = c.prepareStatement("insert into Student(name,phone) values(?,?)");
		PreparedStatement ps1 = c.prepareStatement("insert into Admin(name,phone) values(?,?)");
		PreparedStatement ps2 = c.prepareStatement("insert into Faculty(name,phone) values(?,?)");
		int rows = sh.getRows();// 3		
		int col = sh.getColumns();// 2
		System.out.println(rows +"   "+col);

	      for(int i=0;i<rows;i++) {// for rows
			for(int j=0;j<col;j++) {// for cols
				
				Cell d = sh.getCell(j, i);	
				String data = d.getContents();
				System.out.print(data+"    ");
			}
			System.out.println();
		}
	      
		
	   
       

	
	}



}
