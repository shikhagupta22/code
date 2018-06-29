package com.nucleus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.nucleus.connection.ConnectionI;
import com.nucleus.connection.OracleConnection;
import com.nucleus.pojo.Employee;

public class EmployeeDAO implements EmployeeDAOI
{
	Connection conn=null;
	ConnectionI c=null;

	@Override
	public ArrayList<Employee> fetchAll() 
	{Statement stmt=null;
	 ResultSet rs=null;
	 ArrayList<Employee> emp=new ArrayList<Employee>();
	
	try {
		c=new OracleConnection();
		conn=c.myConnection();
		stmt=conn.createStatement();
		rs=stmt.executeQuery("select * from emp22");
		while(rs.next())
		{
			Employee e=new Employee();
			e.seteNo(rs.getInt(1));
			e.seteName(rs.getString(2));
			e.seteSal(rs.getInt(3));
			emp.add(e);
		}
	} catch (SQLException e) 
	{
		
		e.printStackTrace();
	}
	return emp;
		
		
	}

	@Override
	public Employee fetch(int id) 
	{
		PreparedStatement ps=null;
		ResultSet rs=null;
		Employee e=new Employee();
		
		try {
			c=new OracleConnection();
			conn=c.myConnection();
			ps=conn.prepareStatement("select * from emp22 where empno =?");
			ps.setInt(1,id);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				e.seteNo(rs.getInt(1));
				e.seteName(rs.getString(2));
				e.seteSal(rs.getInt(3));
				
			}
		} catch (SQLException ex) 
		{
			
			ex.printStackTrace();
		}
	return e;
			
			
		
	}

	@Override
	public void delete(int id) 
	{
		int count=0;
		PreparedStatement ps=null;
		Employee e=new Employee();
		
		try {
			c=new OracleConnection();
			conn=c.myConnection();
			ps=conn.prepareStatement("delete from emp22 where empno = ?");
			ps.setInt(1,id);
			ps.execute();
			count++;
			System.out.println("Number of rows deleted :"+ (count++));
			}
			 catch (SQLException ex) 
				{
					
					ex.printStackTrace();
				}
		
	
		
		
	}

	@Override
	public void update(int id,int salary) 
	{
		int count=0;
		PreparedStatement ps=null;
		Employee e=new Employee();
		
		try {
			c=new OracleConnection();
			conn=c.myConnection();
			ps=conn.prepareStatement("update emp22 SET esal=? where empno = ?");
			ps.setInt(1,salary);
			ps.setInt(2,id);
			ps.execute();
			count++;
			System.out.println("Number of rows affected :"+ (count++));
			}
			 catch (SQLException ex) 
				{
					
					ex.printStackTrace();
				}
		
		
		
	}

	@Override
	public Employee fetch(String name) 
	{
		PreparedStatement ps=null;
		ResultSet rs=null;
		Employee e=new Employee();
		
		try {
			c=new OracleConnection();
			conn=c.myConnection();
			ps=conn.prepareStatement("select * from emp22 where ename =?");
			ps.setString(1,name);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				e.seteNo(rs.getInt(1));
				e.seteName(rs.getString(2));
				e.seteSal(rs.getInt(3));
				
			}
			}
			 catch (SQLException ex) 
				{
					
					ex.printStackTrace();
				}
		return e;
		
	}

}
