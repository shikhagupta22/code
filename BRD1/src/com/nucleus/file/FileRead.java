package com.nucleus.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.nucleus.pojo.CustomerPOJO;
import com.nucleus.pojo.CustomerPojo;
import com.nucleus.pojo.Person;




public class FileRead
{
	void readFile(String str1,String str2) throws IOException
	{
		BufferedReader br;
		CustomerPojo cp=new CustomerPojo();
		String str3=str1.concat(str2);
		br=new BufferedReader(new FileReader(str3)); 
	    String string;
		String[] str=null;
		while((string=br.readLine())!=null)
		{
			str=string.split("~");
			cp.setCode(str[1]);
			cp.setName(str[2]);
			cp.setAd1(str[3]);
			cp.setCustAd2(str[4]);
			cp.setCustPinCode(str[5]);
			cp.setCustEmail(str[6]);
			cp.setContact(str[7]);
			cp.setCustPrimaryContactPerson(str[8]);
			cp.setCustRecordStatus(str[9]);
			cp.setCustFlag(str[10]);
			cp.setCustCreateDate(str[11]);
			cp.setCustCreatedBy(str[12]);
			cp.setCustModifiedDate(str[13]);
			cp.setCustModifiedBy(str[14]);
			cp.setCustAuthorizedDate(str[15]);
			cp.setCustAuthorizedBy(str[16]);
			
		}
		
	}

}
