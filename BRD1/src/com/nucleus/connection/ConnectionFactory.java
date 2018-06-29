package com.nucleus.connection;

public class ConnectionFactory 
{
	static ConnectionI getConnection(String str)
	{
		if(str.equalsIgnoreCase("oracle"))
		{
			return new OracleConnection();
		}
		else if(str.equalsIgnoreCase("my sql"))
		{
			return new MySQL();
		}
		return null;
		
	}

}
