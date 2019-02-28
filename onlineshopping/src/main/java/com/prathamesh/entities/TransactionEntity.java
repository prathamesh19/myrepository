package com.prathamesh.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class TransactionEntity {

	@Id
	int transactionId;
	
	@ManyToMany(cascade=CascadeType.ALL)
	List<CustomerEntity> listOfCustomers;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<InventoryEntity> listOfItems;
	
	
	public TransactionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionEntity(int transactionId, List<CustomerEntity> listOfCustomers,
			List<InventoryEntity> listOfItems) {
		super();
		this.transactionId = transactionId;
		this.listOfCustomers = listOfCustomers;
		this.listOfItems = listOfItems;
	}
	@Override
	public String toString() {
		return "TransactionEntity [transactionId=" + transactionId + ", listOfCustomers=" + listOfCustomers
				+ ", listOfItems=" + listOfItems + "]";
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public List<CustomerEntity> getListOfCustomers() {
		return listOfCustomers;
	}
	public void setListOfCustomers(List<CustomerEntity> listOfCustomers) {
		this.listOfCustomers = listOfCustomers;
	}
	public List<InventoryEntity> getListOfItems() {
		return listOfItems;
	}
	public void setListOfItems(List<InventoryEntity> listOfItems) {
		this.listOfItems = listOfItems;
	}
}
