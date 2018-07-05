package com.nucleus.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.nucleus.database.EmployeeDAO;
import com.nucleus.pojo.CustomerPojo;
import com.nucleus.validate.Validation;




public class FileRead
{
	int flag=0;
	public void readFile(String str1,String str2,int ch,Connection conn) throws IOException, SQLException
	{
		BufferedReader br;
		BufferedWriter fr = new BufferedWriter(new FileWriter("d:/error log.txt",true));;
		CustomerPojo cp=new CustomerPojo();
		Validation v=new Validation();
		String str3=str1.concat(str2);
		br=new BufferedReader(new FileReader(str3)); 
		FileWrite fw=new FileWrite();
	    String string;
		String[] str=null;
		while((string=br.readLine())!=null)
		{
			System.out.println("Filereading");
			boolean b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
			str=string.split("~",-1);
			cp.setCode(str[0]);
			cp.setName(str[1]);
			cp.setAd1(str[2]);
			cp.setCustAd2(str[3]);
			cp.setCustPinCode(str[4]);
			cp.setCustEmail(str[5]);
			cp.setContact(str[6]);
			cp.setCustPrimaryContactPerson(str[7]);
			cp.setCustRecordStatus(str[8]);
			cp.setCustFlag(str[9]);
			cp.setCustCreateDate(str[10]);
			cp.setCustCreatedBy(str[11]);
			cp.setCustModifiedDate(str[12]);
			cp.setCustModifiedBy(str[13]);
			cp.setCustAuthorizedDate(str[14]);
			cp.setCustAuthorizedBy(str[15]);
			b1=v.validId(str[0]);
			b2=v.validName(str[1]);
			b3=v.mandatory(str[2]);
			b4=v.validPinCode(str[4]);
			b5=v.validateFormat(str[5]);
			b6=v.contactNumber(str[6]);
			b7=v.mandatory(str[7]);
			b8=v.recordStatus(str[8]);
			b9=v.flag(str[9]);
			b10=v.mandatory(str[10]);
			b11=v.mandatory(str[11]);
			System.out.println(b1+" "+b2+" "+b3+" "+b4+" "+b5+" "+b6+" "+b7+" "+b8+" "+b9+" "+b10+" "+b11);
			System.out.println(string);
			if(b1==false||b2==false||b3==false||b4==false||b5==false||b6==false||b7==false||b8==false||b9==false||b10==false||b11==false||b11==false)
			{
				if(ch==2)
				{
				flag++;
				}
				fw.recordWrite(cp);
				if(b1==false)
					
					{
						fr.append("->There is error in Id");
						fr.flush();
					}
					if(b2==false)
					{
						fr.append("->There is error in name");
						fr.flush();
					}
					if(b3==false)
					{
						fr.append("->There is error in Address1");
						fr.flush();
					}
					if(b4==false)
					{
						fr.append("->There is error in Pin Code");
						fr.flush();
					}
					if(b5==false)
					{
						fr.append("->There is error in Email");
						fr.flush();
					}
					if(b6==false)
					{
						fr.append("->There is error in Contact");
						fr.flush();
					}
					if(b7==false)
					{
						fr.append("->There is error in Primary Contact Person");
						fr.flush();
					}
					if(b8==false)
					{
						fr.append("->There is error in Record Status");
						fr.flush();
					}
					if(b9==false)
					{
						fr.append("->There is error in  flag status");
						fr.flush();
					}
					if(b10==false)
					{
						fr.append("->There is error in create date");
						fr.flush();
					}
					if(b11==false)
					{
						fr.append("->There is error in created by");
						fr.flush();
					}
		}
				if(b1==true&&b2==true&&b3==true&&b4==true&&b5==true&&b6==true&&b7==true&&b8==true&&b9==true&&b10==true&&b11==true)
				{
					if(ch==1)
					{
						EmployeeDAO ed=new EmployeeDAO();
						ed.insert(cp,conn);
						conn.commit();
						
						
					}
					else if(ch==2)
					{
						EmployeeDAO ed=new EmployeeDAO();
						if(flag>0)
						{
							fw.recordWrite(cp);
							conn.rollback();
							continue;
						}
						
						ed.insert(cp,conn);
					}
					
				}
			}
			
			
			br.close();
			fr.close();
			
		}
		
		
	}


