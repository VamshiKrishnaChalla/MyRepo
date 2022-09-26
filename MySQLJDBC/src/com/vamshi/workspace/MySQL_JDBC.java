package com.vamshi.workspace;

import java.sql.*;

public class MySQL_JDBC {
	
	String url = "jdbc:mysql://localhost:3306";
	String userName = "root";
	String pass = userName;
	ResultSet rs;
	String queryReply = null;
	public void JDBCConnectionInitiation(boolean s, String query) throws Exception
	{
		try
		{		
			//Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Establish COnnection
			Connection con = DriverManager.getConnection(url, userName, pass);
			//Pass Statement
			Statement stmt = con.createStatement();
			System.out.println("Connection Established");
			//Execute the query
			stmt.executeUpdate("USE javatestdb1");
			System.out.println("Database selected");
			
//			
//			if(s==true)
//			{
//				int rs = stmt.executeUpdate(query);
//				System.out.println("Table updated "+rs+" rows affected");
//				
//			}
//			else
//			{
//				ResultSet rs = stmt.executeQuery(query);
//				while(rs.next())
//				{
//					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+"\n");
//				}
//			}
//			
//			//Close the connection
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
//
//}
