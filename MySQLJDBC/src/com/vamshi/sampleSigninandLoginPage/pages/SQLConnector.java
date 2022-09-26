package com.vamshi.sampleSigninandLoginPage.pages;

import java.sql.*;

public class SQLConnector {

		public boolean dbConnect(String query, String action) throws ClassNotFoundException, SQLException
		{
			String url = "jdbc:mysql://localhost:3306";
			String userName = "root";
			String pass = userName;

			boolean flag = false;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection con = DriverManager.getConnection(url, userName, pass);
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate("use javatestdb1");
			
			if(action.equals("UPDATE"))
			{
				stmt.executeUpdate(query);
			}
			else if(action.equals("QUERY"))
			{
				ResultSet rs = stmt.executeQuery(query);
				flag =  rs.next();
			}		
			con.close();
			return flag;
			
		}

		public void executeUpdateQuery(String userName, String password) throws ClassNotFoundException, SQLException {
			//Insert Values in users table
			String query = "Insert into users values ('"+userName+"','"+password+"')";
			dbConnect(query, "UPDATE");

		}
		public void executeUpdateQuery(String query) throws ClassNotFoundException, SQLException
		{
			dbConnect(query,"UPDATE");
		}

	}

