package com.vamshi.sampleSigninandLoginPage.pages;

import java.sql.SQLException;

public class DriverCode {

	protected static String msg;
	public String userName;
	public String pass;
	
	public DriverCode(LoginPageDataVO pdo) throws ClassNotFoundException, SQLException
	{
		userName = pdo.getUserName();
		pass = pdo.getPass();
		validateData(userName, pass);
	}
	
	public void validateData(String userName, String pass) throws ClassNotFoundException, SQLException
	{
		DataValidator dv = new DataValidator(userName, pass);
		if(dv.isUserNameValid())
		{
			if(dv.isUserCredValid())
			{
				//Update user Details
				msg = "User "+userName+" logged in!!";
			}
			else
			{
				msg = "Please Enter Valid Password";
			}
		}
		else
		{
			SQLConnector sql = new SQLConnector();
			sql.executeUpdateQuery(userName, pass);
			msg = "Account with username "+userName+" is not created. Please create a new Account";
		}
	}
	
}
