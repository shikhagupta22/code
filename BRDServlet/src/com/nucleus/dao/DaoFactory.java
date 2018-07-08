package com.nucleus.dao;

public class DaoFactory 
{
	public static DaoI getDao(String str)
	{
		if(str.equalsIgnoreCase("rdbms"))
		{
			return new Dao();
		}
		else if(str.equalsIgnoreCase("xml"))
		{
			return new Xml();
		}
		return null;
	}

}
