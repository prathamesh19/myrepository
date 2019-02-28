package com.prathamesh.pojo;


public class CustomerPojo {

	private int customerPojoId;
    private String customerPojoFullName;
	
    @Override
	public String toString() {
		return "CustomerPojo [customerPojoId=" + customerPojoId + ", customerPojoFullName=" + customerPojoFullName
				+ "]";
	}
	public int getCustomerPojoId() {
		return customerPojoId;
	}
	public void setCustomerPojoId(int customerPojoId) {
		this.customerPojoId = customerPojoId;
	}
	public String getCustomerPojoFullName() {
		return customerPojoFullName;
	}
	public void setCustomerPojoFullName(String customerPojoFullName) {
		this.customerPojoFullName = customerPojoFullName;
	}
	
	
	public CustomerPojo(int customerPojoId, String customerPojoFullName) {
		super();
		this.customerPojoId = customerPojoId;
		this.customerPojoFullName = customerPojoFullName;
	}
	
	
	public CustomerPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}
