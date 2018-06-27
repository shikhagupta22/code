package com.nucleus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile 
{
	

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new FileReader("d:/record1.txt"));
		BufferedWriter fr=new BufferedWriter(new FileWriter("d:/record.txt",true));
		Employee e=new Employee();
		Validation v=new Validation();
	    String str;
	    String[] str1=null;
		while((str=br.readLine())!=null)
		{
		   str1=str.split("~");
		   e.setId(Integer.parseInt((str1[0])));
		   e.setName(str1[1]);
		   e.setSalary(Float.parseFloat(str1[2]));
		   e.setDesgn(str1[3]);
		   e.setDept(str1[4]);
		   e.setAd1(str1[5]);
		   e.setAd2(str1[6]);
		   e.setEmailId(str1[7]);
		   e.setHiredate(str1[8]);
		   if(v.validId(str1[0]))
		   {
			   if(v.checkId(str1[0]))
			   {
			   System.out.println(e.getId());
		       }
		   }   
		   else
		   {
			   fr.append(Integer.toString(e.getId()));
		   }
		   if(v.validAdd(str1[5]))
		   {
			   System.out.println(e.getAd1());
		   }
		   else
		   {
			   fr.append(e.getAd1());
			   
		   }
		   if(v.validateFormat(str1[7]))
		   {
			   System.out.println(e.getEmailId());
			   
		   }
		   else
		   {
			   fr.append(e.getEmailId());
			   
		   }
		   System.out.println("Name of employee :"+e.getName()+" Salary :"+e.getSalary()+" Designation :"+e.getDesgn()+" Department :"+e.getDept()+" Alternate address :"+e.getAd2()+" Hire Date :"+e.getHiredate());
		   
			
		}
		br.close();
		fr.close();
		

	}

}
