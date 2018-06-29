package com.nucleus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Example4 
{

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	Customer customer=new Customer();
	customer.setCustId(100);
        customer.setAddress("Agra");
        customer.setcName("Raghav");
	FileOutputStream fout=new FileOutputStream("fil.txt");
	ObjectOutputStream obj=new ObjectOutputStream(fout);
	obj.writeObject(customer);
	FileInputStream fin=new FileInputStream("fil.txt");
	ObjectInputStream objin=new ObjectInputStream(fin);
	Customer cus=(Customer)objin.readObject();
	System.out.println("Customer Details: "+cus.getCustId()+" "+cus.getcName()+" "+cus.getAddress());
	}

}
