package com.prathamesh.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.prathamesh.dao.CustomerDao;
import com.prathamesh.entity.CustomerEntity;
import com.prathamesh.pojo.CustomerPojo;
import com.prathamesh.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

//when using hibernate---	CustomerDao customerDao = new CustomerDaoImpl();
	CustomerDao customerDao; //when using spring

	public void setCustomerDao(CustomerDao customerDao) { //when using spring for setter injection
		this.customerDao = customerDao;
	}

	
	
	@Override
	public boolean addOrUpdateCustomer(CustomerPojo customerPojo) {
		return customerDao.insertOrUpgradeCustomer(new CustomerServiceImpl().pojoToEntity(customerPojo));
	}

	@Override
	public boolean deleteCustomer(int customerPojoId) {
		return customerDao.removeCustomer(customerPojoId);
	}

	@Override
	public CustomerPojo getCustomer(int customerPojoId) {
		return new CustomerServiceImpl().entityToPojo(customerDao.fetchCustomer(customerPojoId));
	}

	@Override
	public List<CustomerPojo> getAllCustomer() {
		return new CustomerServiceImpl().listOfEntityToListOfPojo(customerDao.fetchAllCustomer());
	}

	private CustomerEntity pojoToEntity(CustomerPojo customerPojo) {
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setCustomerEntityId(customerPojo.getCustomerPojoId());
		String[] s = customerPojo.getCustomerPojoFullName().split(" ");
		customerEntity.setCustomerEntityFirstName(s[0]);
		customerEntity.setCustomerEntityLastName(s[1]);
		return customerEntity;

	}

	private CustomerPojo entityToPojo(CustomerEntity customerEntity) {
		CustomerPojo customerPojo = new CustomerPojo();
		customerPojo.setCustomerPojoId(customerEntity.getCustomerEntityId());
		customerPojo.setCustomerPojoFullName(
		customerEntity.getCustomerEntityFirstName() + " " + customerEntity.getCustomerEntityLastName());
		return customerPojo;

	}

	private static List<CustomerEntity> listOfPojoToListOfEntity(List<CustomerPojo> customerPojoList) {
		List<CustomerPojo> listCustomerPojo = new ArrayList<CustomerPojo>();

		return null;

	}

	private List<CustomerPojo> listOfEntityToListOfPojo(List<CustomerEntity> customerEntityList) {
		List<CustomerPojo> l=new ArrayList<>();
		CustomerServiceImpl cS=new CustomerServiceImpl();
		for (int i = 0; i < customerEntityList.size(); i++) {
		      l.add(cS.entityToPojo(customerEntityList.get(i)));
		}
		return l;
	}
}
