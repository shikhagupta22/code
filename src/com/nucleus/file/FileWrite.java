package com.nucleus.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.nucleus.pojo.CustomerPojo;

public class FileWrite 
{
	public void fileWrite(String var) throws IOException
	{
	BufferedWriter fr=new BufferedWriter(new FileWriter("d:/error log.txt",true));
	fr.append(var);

    }
	public void recordWrite(CustomerPojo cp) throws IOException
	{
		System.out.println("file write");
		BufferedWriter fr=new BufferedWriter(new FileWriter("d:/error log.txt",true));
		fr.append(cp.getCode());
		fr.append(cp.getName());
		fr.append(cp.getAd1());
		fr.append(cp.getCustAd2());
		fr.append(cp.getCustPinCode());
		fr.append(cp.getCustEmail());
		fr.append(cp.getContact());
		fr.append(cp.getCustPrimaryContactPerson());
		fr.append(cp.getCustRecordStatus());
		fr.append(cp.getCustFlag());
		fr.append(cp.getCustCreateDate());
		fr.append(cp.getCustCreatedBy());
		fr.append(cp.getCustModifiedDate());
		fr.append(cp.getCustModifiedBy());
		fr.append(cp.getCustAuthorizedDate());
		fr.append(cp.getCustAuthorizedBy());
		fr.flush();
		
		
	}
	//fr.close();
	//fr.close();
}
