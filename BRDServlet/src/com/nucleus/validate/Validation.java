package com.nucleus.validate;

import java.util.ArrayList;

public class Validation 
{
	ArrayList<String> code=new ArrayList<String>();
	public boolean validId(String id)
    {
    	if(!id.isEmpty())
    	{
   	    for(String str:code)
   	 {
   		 if(str==id)
   		 {
   			 return false;
   		 }
   		 else
   		 {
   	    code.add(id);
   	    }
   	}
return true;}
    	return false;
    }	
 
	public boolean mandatory(String var)
	{
		if(var.isEmpty())
			return false;
		else
			return true;
	}
	public boolean validName(String name)
	{
		if(name.matches("[a-zA-Z0-9 ]+")&& !name.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public boolean validPinCode(String code)
	{
		if((code.length()==6)&& !code.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public boolean validateFormat(String emailId)
	{
		if((emailId.matches( "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"))&&!emailId.isEmpty())
		{
			  return true;
		   
		}
		else
		{
	     return false;
		}
	}
	public boolean recordStatus(String status)
	{
		if((status.equalsIgnoreCase("N")||status.equalsIgnoreCase("M")||status.equalsIgnoreCase("D")||status.equalsIgnoreCase("A")||status.equalsIgnoreCase("R"))&&(!status.isEmpty()))
			{
			return true;
			}
		else
		{
			return false;
		}
	}
	public boolean flag(String flag)
	{
		if((flag.equalsIgnoreCase("A")||flag.equalsIgnoreCase("I"))&&!flag.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public boolean contactNumber(String number)
	{
		if(number.length()<=20)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
