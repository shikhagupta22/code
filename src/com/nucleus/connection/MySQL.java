package com.nucleus.connection;

import java.sql.Connection;

public class MySQL implements ConnectionI
{

	@Override
	public Connection getConnection() 
	{
		Connection conn = null;
		System.out.println(" My SQL connected");
		return conn;
		
	}

}
