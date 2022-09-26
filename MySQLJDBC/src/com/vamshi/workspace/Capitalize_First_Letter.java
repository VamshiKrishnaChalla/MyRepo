package com.vamshi.workspace;
import java.util.*;
class Capitalize_First_Letter 
{
	public static void main(String[] args) 
	{
		String s = new String();
		
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);

		String outputString = "";

		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			Character ch = token.charAt(0);
			token = token.replace(token.charAt(0),Character.toUpperCase(ch));
			System.out.print(token+" ");
		}
	}
}
