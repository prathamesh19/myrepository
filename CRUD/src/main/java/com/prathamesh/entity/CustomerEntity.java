package com.prathamesh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_INFO")
public class CustomerEntity {

	@Id
	private int customerEntityId;
	
	private String customerEntityFirstName;
	private String customerEntityLastName;
	
	@Override
	public String toString() {
		return "CustomerEntity [customerEntityId=" + customerEntityId + ", customerEntityFirstName="
				+ customerEntityFirstName + ", customerEntityLastName=" + customerEntityLastName + "]";
	}
	
	public int getCustomerEntityId() {
		return customerEntityId;
	}
	public void setCustomerEntityId(int customerEntityId) {
		this.customerEntityId = customerEntityId;
	}
	public String getCustomerEntityFirstName() {
		return customerEntityFirstName;
	}
	public void setCustomerEntityFirstName(String customerEntityFirstName) {
		this.customerEntityFirstName = customerEntityFirstName;
	}
	public String getCustomerEntityLastName() {
		return customerEntityLastName;
	}
	public void setCustomerEntityLastName(String customerEntityLastName) {
		this.customerEntityLastName = customerEntityLastName;
	}
	
	public CustomerEntity(int customerEntityId, String customerEntityFirstName, String customerEntityLastName) {
		super();
		this.customerEntityId = customerEntityId;
		this.customerEntityFirstName = customerEntityFirstName;
		this.customerEntityLastName = customerEntityLastName;
	}
	
	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
