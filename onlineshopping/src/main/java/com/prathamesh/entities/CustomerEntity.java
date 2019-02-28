package com.prathamesh.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class CustomerEntity {

	@Id
	int customerId;
String customerName;

@ManyToMany(cascade=CascadeType.ALL)
@JoinTable
List<TransactionEntity> listOfTransactions;

public CustomerEntity() {
	super();
	// TODO Auto-generated constructor stub
}

public CustomerEntity(int customerId, String customerName, List<TransactionEntity> listOfTransactions) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.listOfTransactions = listOfTransactions;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public List<TransactionEntity> getListOfTransactions() {
	return listOfTransactions;
}

public void setListOfTransactions(List<TransactionEntity> listOfTransactions) {
	this.listOfTransactions = listOfTransactions;
}

@Override
public String toString() {
	return "CustomerEntity [customerId=" + customerId + ", customerName=" + customerName + ", listOfTransactions="
			+ listOfTransactions + "]";
}
}
