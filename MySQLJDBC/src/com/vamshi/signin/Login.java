package com.vamshi.signin;

import java.sql.SQLException;
import java.util.Scanner;

public class Login {
	
	public String userName;
	public String pass;
	
	public Login(String userName,String pass)
	{
		this.userName = userName;
		this.pass = pass;
	}

	public void userLogin() throws ClassNotFoundException, SQLException, InterruptedException {
		SQLConnector sql = new SQLConnector();
		while(!sql.isUserCredValid(userName,pass))//if false out of loop
		{
			new ErrorMsgDisplay("Please Enter correct credentials");
			
		}
		 sql.executeQuery(userName, pass);
		
	}
}
