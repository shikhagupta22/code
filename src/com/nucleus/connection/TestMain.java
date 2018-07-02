package com.nucleus.connection;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.nucleus.file.FileRead;

public class TestMain 
{

	public static void main(String[] args) throws IOException, SQLException 
	{
		ConnectionI c=ConnectionFactory.getConnection("oracle");
		c.getConnection();
		Scanner sc=new Scanner(System.in);
		int ch;
		String str1=null,str2=null;
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
		System.out.println("Enter 1 for rejection level R");
		System.out.println("Enter 2 for rejection level F");
		ch=sc.nextInt();
	    FileRead f=new FileRead();
		f.readFile(str1,str2,ch);

	}

}
