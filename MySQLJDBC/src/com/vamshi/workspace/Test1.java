package com.vamshi.workspace;
interface Java8Features 
{
	void printmsg(String msg);
}

public class Test1
{
	public static void main(String args[])
	{
		Java8Features jf1 = (msg) -> {System.out.println(msg);
		};
		jf1.printmsg("Hello World");

		Java8Features jf2 = (msg) -> {System.out.println(msg+"Java programmer");
		};
		jf2.printmsg("This is");
	}
		
}
