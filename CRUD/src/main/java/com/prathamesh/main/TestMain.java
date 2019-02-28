package com.prathamesh.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prathamesh.entity.CustomerEntity;
import com.prathamesh.pojo.CustomerPojo;
import com.prathamesh.service.CustomerService;
import com.prathamesh.service.impl.CustomerServiceImpl;

/**
 * Project Name---CustomerCrud
               ----using only hibernate
 * Project Structure
 *  src/main/java
 *            com.prathamesh.constants
 *                   AppLevelConstants (enum)
 *            com.prathamesh.entity
 *                   CustomerEntity(annoatated class)
 *            com.prathamesh.pojo
 *                   CustomerPojo(non annotated class)
 *            com.prathamesh.dao
 *                   CustomerDao(I)
 *                         insertorupdate()
 *                         remove()
 *                         fetch()
 *                         fetchall()
 *            com.prathamesh.dao.impl
 *                   CustomerDaoImpl(C) implements CustomerDao
 *            com.prathamesh.service
 *                   CustomerService(I)
 *                         addorupdate()
 *                         delete()
 *                         get()
 *                         getall()
 *            com.prathamesh.service.impl
 *                   CustomerServiceImpl implements CustomerService
 *            com.prathamesh.util
 *                    HibernateUtil(C)
 *            com.prathamesh.main
 *                    TestMain(main method class)
 *            hibernate.hsqldb.cfg.xml
 * 
 * @author Prathamesh
 *
 */
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	CustomerPojo c1=new CustomerPojo(101,"Rod Johnson");
	CustomerPojo c2=new CustomerPojo(102,"Dennis Ritchie");
	CustomerPojo c3=new CustomerPojo(103,"James Gosling");
	CustomerPojo c4=new CustomerPojo(104,"Charles Babbage");
	
	/*CustomerService customerService=new CustomerServiceImpl();
	List l=customerService.getAllCustomer();
System.out.println(l);*/
		
	ApplicationContext context=new ClassPathXmlApplicationContext("/SpringBeanConfig.xml");
	CustomerService cService=  (CustomerService) context.getBean("cService");
	List l=cService.getAllCustomer();
	System.out.println(l);
	}
	
	
	
	
	
	
}