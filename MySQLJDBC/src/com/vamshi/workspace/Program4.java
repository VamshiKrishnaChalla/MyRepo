package com.vamshi.workspace;
import java.util.*;
class Program4 
{
	public static void main(String[] args) 
	{
		String s = new String();
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		
		int vowels = 0;
		int consonants = 0;
		
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens())
		{
			for(int i = 0;i<st.countTokens();i++)
			{
				StringBuffer token = new StringBuffer(st.nextToken());
				

				for(int j =0;j<token.length();j++)
				{
					if(token.charAt(j)=='a'||token.charAt(j)=='e'||token.charAt(j)=='i'||token.charAt(j)=='o'||token.charAt(j)=='u')
						vowels++;
					else
						consonants++;
				}

				System.out.println("Vowels in "+token+" is "+vowels);
				System.out.println("Consonants in "+token+" is "+consonants);
				System.out.println("--------------");
			    vowels = 0;
				consonants = 0;

			}
		}
	}
}
