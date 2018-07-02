package com.nucleus.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nucleus.connection.ConnectionFactory;
import com.nucleus.connection.ConnectionI;
import com.nucleus.pojo.CustomerPojo;

public class EmployeeDAO implements DAOI
{
	Connection conn=null;
	ConnectionI c=null;

	@Override
	public void insert(CustomerPojo cp) 
	{ PreparedStatement ps=null;
	  //ResultSet rs=null;
	  //CustomerPojo cp=new CustomerPojo();
      System.out.println("Database write");	  
		try 
		{
			c=ConnectionFactory.getConnection("oracle");
			conn=c.getConnection();
			ps=conn.prepareStatement("insert into customer_shikha values(seq_id1.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			conn.setAutoCommit(false);
			System.out.println("Just before code");
			ps.setString(1,cp.getCode());
			System.out.println("Just before code1");
			ps.setString(2,cp.getName());
			ps.setString(3,cp.getAd1());
			ps.setString(4,cp.getCustAd2());
			ps.setString(5,cp.getCustPinCode());
			ps.setString(6,cp.getCustEmail());
			ps.setString(7,cp.getContact());
			System.out.println("Just before code1");
			ps.setString(8,cp.getCustPrimaryContactPerson());
			ps.setString(9,cp.getCustRecordStatus());
			ps.setString(10,cp.getCustFlag());
			ps.setString(11,cp.getCustCreateDate());
			ps.setString(12,cp.getCustCreatedBy());
			ps.setString(13,cp.getCustModifiedDate());
			ps.setString(14,cp.getCustModifiedBy());
			ps.setString(15,cp.getCustAuthorizedDate());
			ps.setString(16,cp.getCustAuthorizedBy());
			System.out.println("Just before end");
			System.out.println(cp.getCode());
			ps.executeUpdate();
			System.out.println("end");
			
			
			
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		finally
		{
			try {
				conn.close();
			} catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
		}
	
		
		
	}

}
