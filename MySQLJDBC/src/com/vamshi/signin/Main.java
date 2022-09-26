package com.vamshi.signin;

import java.util.Scanner;
import java.sql.*;
public class Main 
{

	public static void main(String args[]) throws ClassNotFoundException, SQLException, InterruptedException
	{
		PageDataVO pdo = new PageDataVO();
		Demo1WBuilder demo = new Demo1WBuilder();
		
		demo.startApplication();
		
		String email = pdo.getEmail();
		String pass = String.valueOf(pdo.getPassword());
		String action = (pdo.isLoginOption()?"login":"signup");

		if(action.equals("login"))
		{
			Login login =new Login(email, pass);
			login.userLogin();
			System.out.println("User Logged in!!!!");
		}
		else if(action.equals("signup"))
		{
			Signup signup = new Signup(email, pass);
			signup.userSignup();
			System.out.println("User Credentials stored in database");
			System.out.println("Please login through new Credentials");
		}
		else
		{
			System.out.println("Choose Valid option");
		}
	}

}
