package com.nucleus.connection;

public class TestConnection 
{

	public static void main(String[] args) 
	{
		ConnectionI c=ConnectionFactory.getConnection("oracle");
		c.myConnection();

	}

}
