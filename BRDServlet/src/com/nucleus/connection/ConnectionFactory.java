package com.nucleus.connection;

public class ConnectionFactory 
{
	public static ConnectionI getConnection(String str)
	{
		if(str.equalsIgnoreCase("oracle"))
		{
			return new OracleConnection();
		}
		else if(str.equalsIgnoreCase("MySql"))
		{
			return new MySql();
		}
		return null;
		
	}

}
