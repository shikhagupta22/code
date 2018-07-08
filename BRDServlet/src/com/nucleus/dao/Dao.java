package com.nucleus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nucleus.pojo.CustomerPojo;

public class Dao implements DaoI
{

	@Override
	public void insert(CustomerPojo cp,Connection conn) 
	{
		
	    PreparedStatement ps=null;
        System.out.println("Database write");	  
		try 
		{
			
			ps=conn.prepareStatement("insert into customer_shikha values(seq_id1.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			conn.setAutoCommit(false);
			System.out.println("Start");
			ps.setString(1,cp.getCode());
			ps.setString(2,cp.getName());
			ps.setString(3,cp.getAd1());
			ps.setString(4,cp.getCustAd2());
			ps.setString(5,cp.getCustPinCode());
			ps.setString(6,cp.getCustEmail());
			ps.setString(7,cp.getContact());
			ps.setString(8,cp.getCustPrimaryContactPerson());
			ps.setString(9,cp.getCustRecordStatus());
			ps.setString(10,cp.getCustFlag());
			ps.setString(11,cp.getCustCreateDate());
			ps.setString(12,cp.getCustCreatedBy());
			ps.setString(13,cp.getCustModifiedDate());
			ps.setString(14,cp.getCustModifiedBy());
			ps.setString(15,cp.getCustAuthorizedDate());
			ps.setString(16,cp.getCustAuthorizedBy());
			System.out.println(cp.getCode());
			ps.executeUpdate();
			System.out.println("end");
			} 
		catch (SQLException e) 
		{
			System.out.println("unique constraint violated");
		}

	
		
		
	}
}
