package com.nucleus;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStreamExample 
{

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream f=new FileOutputStream("d:/file4.txt");
		int x=43;
		f.write(x);
		f.flush();
		FileWriter wr=new FileWriter("d:/file4.txt",true);
		//char w='w';
		wr.append('w');
		wr.append('e');
		wr.append('f');
		wr.flush();
		System.out.println("File created ");
		FileInputStream fin=new FileInputStream("d:/file4.txt");
		int n;
		while((n=fin.read())!=-1){
		System.out.println(" "+n);
		}
		

	}

}
