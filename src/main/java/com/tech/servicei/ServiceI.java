package com.tech.servicei;

import java.util.List;

import com.tech.model.Customer;

public interface ServiceI {
	
	public int insertData(Customer c);
	
	public List<Customer> fetchAllData(String us,String pass);
	
	public List<Customer> fetchSingleRecord(String us,String pass);
	
	public int deleteData(int c_Id);
	
	public  Customer editData(int c_Id);

}
