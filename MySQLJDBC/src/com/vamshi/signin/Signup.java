package com.vamshi.signin;

import java.sql.SQLException;
import java.util.Scanner;

public class Signup {
	
	private String userName;
	private String pass;


	public Signup(String userName,String pass)
	{
		this.userName = userName;
		this.pass = pass;
	}


	public void userSignup() throws ClassNotFoundException, SQLException, InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		SQLConnector sql = new SQLConnector();
		while(sql.isUserNameExists(userName))
		{
			new ErrorMsgDisplay("Username already exists. Please enter unique Username");
		}
		sql.executeUpdateQuery(userName, pass);
		
	}

}
