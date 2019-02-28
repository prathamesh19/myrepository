package com.prathamesh.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prathamesh.dao.CustomerDao;
import com.prathamesh.entity.CustomerEntity;
import com.prathamesh.pojo.CustomerPojo;

public class CustomerDaoImpl implements CustomerDao {

	//when using hibernate---SessionFactory sessionFactory=new Configuration().configure("/hibernate.hsqldb.cfg.xml").buildSessionFactory();
	
	SessionFactory sessionFactory; //when using spring
	
	public void setSessionFactory(SessionFactory sessionFactory) { //when using spring for setter injection
		this.sessionFactory = sessionFactory;
	}
	
	
	
	@Override
	public boolean insertOrUpgradeCustomer(CustomerEntity customerEntity) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(customerEntity);
		session.flush();
		transaction.commit();
		return true;
	}

	

	@Override
	public boolean removeCustomer(int customerEntityId) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		CustomerEntity customerEntity=session.get(CustomerEntity.class, customerEntityId);
		session.delete(customerEntity);
		session.flush();
		transaction.commit();
		return true;
	}

	@Override
	public CustomerEntity fetchCustomer(int customerEntityId) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		CustomerEntity customerEntity=session.get(CustomerEntity.class, customerEntityId);
		session.flush();
		transaction.commit();
		return customerEntity;
	}

	@Override
	public List<CustomerEntity> fetchAllCustomer() {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
        List<CustomerEntity> listOfCustomerEntity=session.createQuery("From CustomerEntity").list();
        session.flush();
        transaction.commit();        
        return listOfCustomerEntity;
	}

	
}
