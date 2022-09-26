package com.vamshi.workspace;

import java.util.*;
import java.io.*;
class FileExample 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis = new FileInputStream("abc2.txt");
			byte[] b = new byte[fis.available()];
			fis.read(b);
			fis.close();
			FileOutputStream fos = new FileOutputStream("abc1.txt", true);
			fos.write(b);
			fos.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
