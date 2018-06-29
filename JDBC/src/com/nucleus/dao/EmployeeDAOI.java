package com.nucleus.dao;

import java.util.ArrayList;

import com.nucleus.pojo.Employee;

public interface EmployeeDAOI 
{
	public ArrayList<Employee> fetchAll();
	public Employee fetch(int id);
	public Employee fetch(String name);
	public void delete (int id);
	public void update (int salary,int id);
	
	

}
