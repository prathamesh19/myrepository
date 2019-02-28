package com.prathamesh.dao;

import java.util.List;

import com.prathamesh.entity.CustomerEntity;

public interface CustomerDao {

	boolean insertOrUpgradeCustomer(CustomerEntity customerEntity);
	boolean removeCustomer(int customerEntityId);
	CustomerEntity fetchCustomer(int customerEntityId);
	List<CustomerEntity> fetchAllCustomer();
	
}
