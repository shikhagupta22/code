package com.nucleus.file;

import java.util.Scanner;

public class TestMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter the physical location of file");
		str1=sc.next();
		System.out.println("Enter the name of file");
		str2=sc.next();
		if(str2.contains(".txt"))
		{
			System.out.println("Your file is validated");
		}
		else
		{
			System.out.println("Please enter valid file");
			System.out.println("Enter the name of file");
			str2=sc.next();
		}
		
		

	}

}
