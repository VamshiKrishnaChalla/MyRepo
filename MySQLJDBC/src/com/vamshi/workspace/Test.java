package com.vamshi.workspace;
import java.util.Scanner;
class Test 
{
	public static void main(String[] args) 
	{
		String s = new String();
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();

		int vowels = 0;
		int consonants = 0;
		
		StringBuffer sb = new StringBuffer(s);
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				vowels +=1;
			else
				consonants +=1;		
		}

		System.out.println(vowels);
		System.out.println(consonants);
	}
}
