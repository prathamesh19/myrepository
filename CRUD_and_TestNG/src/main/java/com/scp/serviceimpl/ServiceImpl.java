package com.scp.serviceimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scp.entities.EmployeeInfo;
import com.scp.service.Service;
import com.scp.util.AppUtil;

public class ServiceImpl implements Service{

	@Override
	public boolean addEmployee(EmployeeInfo emp) {
		SessionFactory sf=AppUtil.getSessionFactory();
		Session s1=AppUtil.getSession(sf);
		Transaction tr1=AppUtil.getTransaction(s1);
		s1.save(emp);
		AppUtil.flushSession(s1);
		AppUtil.commitTransaction(tr1);
		return false;
	}

	@Override
	public EmployeeInfo getEmployeeInfo(int id) {
		SessionFactory sf=AppUtil.getSessionFactory();
		Session s1=AppUtil.getSession(sf);
		EmployeeInfo e2=s1.get(EmployeeInfo.class,id);
		
		return e2;
	}
	
	}

