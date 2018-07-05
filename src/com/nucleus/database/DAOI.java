package com.nucleus.database;

import java.sql.Connection;

import com.nucleus.pojo.CustomerPojo;

public interface DAOI 
{
	public void insert(CustomerPojo cp,Connection conn);

}
