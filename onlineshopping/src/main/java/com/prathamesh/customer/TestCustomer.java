package com.prathamesh.customer;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prathamesh.hibernateutilities.HibernateUtil;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer c1=new Customer(1001,"james","pune","99999","a","a123");
Customer c2=new Customer(1002,"dennis","mumbai","8888888","b","b123");
Customer c3=new Customer(1003,"charles","nagpur","77777","c","c123");
Customer c4=new Customer(1004,"kathy","delhi","555555","d","d123");
CustomerService cs=new CustomerServiceImpl();
cs.addCustomer(c1);
cs.addCustomer(c2);
cs.addCustomer(c3);
cs.addCustomer(c4);
	}

}

@Entity
@Table(name="CUSTOMER_DETAILS")
class Customer{
	
	@Id
	@Column(name="ID")
	private int customerId;
	@Column(name="NAME")
	private String customerName;
	@Column(name="ADDRESS")
	private String customerAddress;
	@Column(name="MOBILE_NUMBER")
	private String customerMobileNumber;
	@Column(name="USERNAME")
	private String customerUsername;
	@Column(name="PASSWORD")
	private String customerPassword;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, String customerAddress, String customerMobileNumber,
			String customerUsername, String customerPassword) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerMobileNumber = customerMobileNumber;
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
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
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}
	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}
	public String getCustomerUsername() {
		return customerUsername;
	}
	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerMobileNumber=" + customerMobileNumber + ", customerUsername="
				+ customerUsername + ", customerPassword=" + customerPassword + "]";
	}
}

interface CustomerService{
	boolean addCustomer(Customer customer);
	boolean deleteCustomer(int id);
	boolean updateCustomer(int id,Customer customer);
	Customer getCustomer(int id);
	List<Customer> getAllCustomers();
}

class CustomerServiceImpl implements CustomerService{

	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session s= HibernateUtil.getSession(sf);
	Transaction tr=HibernateUtil.getTransaction(s);
	
	public boolean addCustomer(Customer customer) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s= HibernateUtil.getSession(sf);
		Transaction tr=HibernateUtil.getTransaction(s);
		s.save(customer);
		s.flush();
		tr.commit();
		return false;
	}

	public boolean deleteCustomer(int id) {
          Customer dbEntity=s.get(Customer.class, id);
          s.evict(dbEntity);
		return true;
	}

	public boolean updateCustomer(int id,Customer customer) {
         Customer dbEntity=s.get(Customer.class, id);
         if(id!=dbEntity.getCustomerId()){
        	 System.out.println("Customer Id mismatch ! Enter Valid ID");
         }
         if(id==dbEntity.getCustomerId()){
        	 s.save(customer);
         }
		return true;
	}

	public Customer getCustomer(int id) {
         Customer dbEntity=s.get(Customer.class, id);
		return dbEntity;
	}

	public List<Customer> getAllCustomers() {
           CustomerService customerService=new CustomerServiceImpl();
           
		  return null;
	}
	
}