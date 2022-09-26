package com.vamshi.workspace;
import java.util.*;
import java.sql.*;

class MySqlQuery1
{
	public static void main(String args[]) throws Exception
	{
		
		String query1 = 
				"Insert into javatesttable1 values "
				+ "(3, 'Arun', 24000)";
//		
//		String query2 = "Select * from javatesttable1";
		
		MySQL_JDBC mysql = new MySQL_JDBC();
		mysql.JDBCConnectionInitiation(true, query1);
//		mysql.JDBCConnectionInitiation(false, query2);

	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String url = "jdbc:mysql://localhost:3306/javatestdb1?characterEncoding=latin1";
//		String userName = "root";
//		String pass = "root";
//		
//		Scanner sc = new Scanner(System.in);
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url,userName,pass);
//		Statement stmt = con.createStatement();
//		System.out.println("Connection detected");
//		
//		//String query = "CREATE TABLE javatesttable1 (id int, name varchar(30), salary int)";
//		
//		//String query = "INSERT INTO javatesttable1 values (1,'Prakash',90000)";
//		
//		String query = "SELECT * FROM javatesttable1";
//		
//		String name = "";
//		
//		//stmt.executeUpdate(query);
//		ResultSet rs = stmt.executeQuery(query);
//		while(rs.next())
//		{
//			name = rs.getString(2);
//		}
//		
//		System.out.println("Query Exceuted "+name);
//		
//		con.close();
//	}
//}