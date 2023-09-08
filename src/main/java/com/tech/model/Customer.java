package com.tech.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private  int c_Id;
	
	private String c_Name;
	
	private String c_Address;
	
	private String c_MobileNo;
	
	private String user_Name;
	
	private String password;

	

	public int getC_Id() {
		return c_Id;
	}

	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}

	public String getC_Name() {
		return c_Name;
	}

	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}

	public String getC_Address() {
		return c_Address;
	}

	public void setC_Address(String c_Address) {
		this.c_Address = c_Address;
	}

	public String getC_MobileNo() {
		return c_MobileNo;
	}

	public void setC_MobileNo(String c_MobileNo) {
		this.c_MobileNo = c_MobileNo;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
