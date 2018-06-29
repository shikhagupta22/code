package com.nucleus;

import java.io.Serializable;


public class Customer implements Serializable
{
private int custId;
private String cName;
private String address;
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
