package com.vamshi.signin;
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
		System.out.println("Connection Established");
		stmt.executeLargeUpdate("use javatestdb1");
		
		if(action.equals("UPDATE"))
		{
			stmt.executeUpdate(query);
			System.out.println("UserName and password updated into tables");	
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

	public void executeQuery(String userName, String pass) throws SQLException, ClassNotFoundException {
		// Create new Table loginUsers and update there
		String query = "Insert into loginusers values ('"+userName+"')";
		
		dbConnect(query, "UPDATE");
		
	}
	public boolean isUserNameExists(String userName) throws SQLException, ClassNotFoundException  {
		
		String query = "SELECT * from users where userName = '"+userName+"'";
		return dbConnect(query,"QUERY");
		
	}

	public boolean isUserCredValid(String userName, String pass) throws SQLException, ClassNotFoundException  {
		String query = ("SELECT * from users where userName = '"+userName+"' AND password = '"+pass+"'");
		return dbConnect(query,"QUERY");
		
	}

}
