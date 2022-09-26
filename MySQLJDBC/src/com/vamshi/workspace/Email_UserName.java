package com.vamshi.workspace;
import java.util.*;
class Email_UserName 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String email = new String(sc.nextLine());

		String[] user_name = email.split("@");
		System.out.println(user_name);

	}
}
