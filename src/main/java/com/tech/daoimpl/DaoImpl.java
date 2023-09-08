package com.tech.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.daoi.DaoI;
import com.tech.model.Customer;

@Repository
public class DaoImpl implements DaoI {

	@Autowired
	SessionFactory sf;

	@Override
	public int insertData(Customer c) {

		Session sn = sf.openSession();
		Transaction tr = sn.beginTransaction();

		sn.saveOrUpdate(c);
		int cid=c.getC_Id();
		tr.commit();
		sn.close();

		return cid;
	}

	@Override
	public List<Customer> fetchAllData(String us, String pass) {

		Session sn = sf.openSession();

		Query<Customer> q = sn.createQuery("from Customer");
		List<Customer> list = q.getResultList();
		return list;
	}

	@Override
	public int deleteData(int c_Id) {

		Session sn = sf.openSession();

		Transaction tr = sn.beginTransaction();

		Customer cs = sn.get(Customer.class, c_Id);

		sn.delete(cs);
		tr.commit();

		Customer c = sn.get(Customer.class, c_Id);
		if (c != null) {
			sn.close();
			return 1;

		} else {
			return 0;
		}
	}

	@Override
	public List<Customer> fetchSingleRecord(String us, String pass) {

		Session sn = sf.openSession();

		Query<Customer> q = sn.createQuery("from Customer where user_Name=:us and password=:pass");
		q.setParameter("us", us);
		q.setParameter("pass", pass);

		List<Customer> list = q.getResultList();

		sn.close();

		return list;
	}

	@Override
	public Customer editData(int c_Id) {
		
		Session sn=sf.openSession();
		
		Customer c=sn.get(Customer.class, c_Id);
		
		sn.close();
		return c;
	}

}
