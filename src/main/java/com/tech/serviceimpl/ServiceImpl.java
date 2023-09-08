package com.tech.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.daoi.DaoI;
import com.tech.model.Customer;
import com.tech.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	DaoI di;
	
	@Override
	public int insertData(Customer c) {
		
		return di.insertData(c);
	}

	@Override
	public List<Customer> fetchAllData(String us, String pass) {
		
		return di.fetchAllData(us, pass);
	}

	@Override
	public int deleteData(int c_Id) {
		
		return di.deleteData(c_Id);
	}

	@Override
	public List<Customer> fetchSingleRecord(String us, String pass) {
		
		return di.fetchSingleRecord(us, pass);
	}

	@Override
	public Customer editData(int c_Id) {
		
		return di.editData(c_Id);
	}

}
