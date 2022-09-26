package com.vamshi.sampleSigninandLoginPage.pages;

import java.sql.SQLException;

public class DataValidator {
	
	String userName;
	String pass;
	SQLConnector sqlconnect = new SQLConnector();
	
	public DataValidator(String userName, String pass)
	{
		this.userName = userName;
		this.pass = pass;
	}

	public DataValidator(String userName2) {
		this.userName = userName;
	}

	public boolean isUserNameValid() throws SQLException, ClassNotFoundException  {
		
		String query = "SELECT * from new_user_details where userName = '"+userName+"'";
		return sqlconnect.dbConnect(query,"QUERY");
		
	}

	public boolean isUserCredValid() throws SQLException, ClassNotFoundException  {
		String query = ("SELECT * from new_user_details where userName = '"+userName+"' AND pass = '"+pass+"'");
		return sqlconnect.dbConnect(query,"QUERY");
		
	}

}
