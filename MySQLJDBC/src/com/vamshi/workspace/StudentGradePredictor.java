package com.vamshi.workspace;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import java.sql.*;


public class StudentGradePredictor {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException, SQLException
	{
		//Retrieving Values
		FileInputStream fis = new FileInputStream("C:\\Users\\vamsh\\OneDrive\\Desktop\\SampleNames.txt");
		byte[] b = new byte[fis.available()];
		fis.read(b);
		fis.close();
		String name = new String(b);
		ArrayList<String> names =new ArrayList<String>(Arrays.asList(name.split(System.getProperty("line.separator"))));
		System.out.println(name);
		
		//Dumping names into db
		
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String pass = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,pass);
		Statement stmt = con.createStatement();
		stmt.executeUpdate("USE javatestdb1");
		int id = 0;
		for(String items:names)
		{
			id++;
			stmt.executeUpdate("insert into sms values ("+id+",'"+items+"')");
			System.out.println(items+" added");
		}
		con.close();
		
	}
	

}
