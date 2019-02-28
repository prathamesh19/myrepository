package com.prathamesh.service;

import java.util.List;

import com.prathamesh.pojo.CustomerPojo;

public interface CustomerService {

	boolean addOrUpdateCustomer(CustomerPojo customerPojo);
	boolean deleteCustomer(int customerPojoId);
	CustomerPojo getCustomer(int customerPojoId);
	List<CustomerPojo> getAllCustomer();
	
}
