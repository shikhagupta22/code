package com.nucleus.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.nucleus.dao.EmployeeDAO;
import com.nucleus.dao.EmployeeDAOI;
import com.nucleus.pojo.Employee;

public class TestConnection 
{

	public static void main(String[] args) throws SQLException 
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		Connection con;
		ConnectionI c=new OracleConnection();
		con=c.myConnection();
		EmployeeDAOI dao=new EmployeeDAO();
		do
		{
			System.out.println(" Press 1 to view all employees");
			System.out.println(" Press 2 to view specific employee id on the basis of id or name");
			System.out.println(" Press 3 to to delete details of employee on the basis of id ");
			System.out.println(" Press 4 to change salary of employee on the basis of id");
			System.out.println(" Press 0 to exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:ArrayList<Employee> list;
		    list=dao.fetchAll();
		    for(Employee emp:list)
		    {
		    	System.out.println(emp.geteNo()+" "+emp.geteName()+" "+emp.geteSal());
		    }
		    break;
			case 2:int cho;
				  do
			      {System.out.println("Press 1 for id");
			       System.out.println("Press 2 for name");
			       cho=sc.nextInt();
			       switch(cho)
			       {
			       case 1:System.out.println("Enter id");
			       int id=sc.nextInt();
			       Employee emp =new Employee();
			       emp=dao.fetch(id);
				   System.out.println(emp.geteNo()+" "+emp.geteName()+" "+emp.geteSal());
				   break;
			       case 2:System.out.println("Enter name");
			       String name=sc.next();
			       Employee emp1 =new Employee();
			       emp1=dao.fetch(name);
				   System.out.println(emp1.geteNo()+" "+emp1.geteName()+" "+emp1.geteSal());
				   break;
			       case 0:System.exit(0);
			              break;
				   }
			      }while(cho==1||cho==2);
			       break;
		    case 3:System.out.println("Enter id");
		           int id=sc.nextInt();
			       dao.delete(id);
				   break;
			case 4:System.out.println("Enter id and salary");
	           int id1=sc.nextInt();
	           int salary=sc.nextInt();
		       dao.update(id1,salary);
			   break;
			case 0:System.exit(0);
			
			
			}
			
		}
		while(ch==1||ch==2||ch==3||ch==4);
		
		

	}

}
