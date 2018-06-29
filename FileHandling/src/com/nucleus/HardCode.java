package com.nucleus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class HardCode 
{

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("d:/hardcode.txt");
		String str="just";
		FileInputStream fin=new FileInputStream("d:/hardcode.txt");
		int n,copy=0;
		
		while((n=fin.read())!=-1)
		{
			System.out.println("inside while");
		
			if(str.equals("shikha"))
			{
				copy++;
			}
			
			
			
		}
		if(copy>0)
		{
			System.out.println("Number of times string present in the file is: "+copy);
		}
		else
		{
			System.out.println("String not found");
			
		}
		

	}

}
