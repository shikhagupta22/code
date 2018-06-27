package com.nucleus;


public class Validation 
{
	int code[]=new int[10];
	boolean validateFormat(String emailId)
	{
		if((emailId.contains("@"))&&emailId.endsWith(".com"))
		{
			  return true;
		   
		}
		else
		{
	     return false;
		}
	}
	boolean validAdd(String add)
	{
		if(add!=null)
			return true;
		else
			return false;
	}
	boolean validId(String id)
	{
		int i=0;
		while(code[i]!=0)
		{
			if(Integer.parseInt(id)==code[i])
			{
				return false;
			}
			else
			{
				i++;
			}
			
			
		}
		code[i]=Integer.parseInt(id);
		return true;
	}
	boolean checkId(String id)
	{
		if(id!=null)
			return true;
		else
			return false;
	}
}
