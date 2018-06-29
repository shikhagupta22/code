package com.nucleus.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.nucleus.connection.ConnectionI;
import com.nucleus.connection.OracleConnection;
import com.nucleus.pojo.Customer1;

public class CustomerDAO implements CustomerDAOI
{
	Connection conn=null;
	ConnectionI c=null;

	@Override
	public ArrayList<Customer1> fetchAll() 
	{
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<Customer1> cust=new ArrayList<Customer1>();
		
		try {
			c=new OracleConnection();
			conn=c.myConnection();
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from Customer1");
			while(rs.next())
			{
				Customer1 c=new Customer1();
				c.setcId(rs.getInt(1));
				c.setcName(rs.getString(2));
				cust.add(c);
			}
		} catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		return cust;
	}

}
