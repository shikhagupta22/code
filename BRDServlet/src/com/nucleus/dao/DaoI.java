package com.nucleus.dao;

import java.sql.Connection;

import com.nucleus.pojo.CustomerPojo;

public interface DaoI 
{
	public void insert(CustomerPojo cp,Connection conn);

}
