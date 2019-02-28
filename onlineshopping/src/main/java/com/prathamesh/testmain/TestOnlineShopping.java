package com.prathamesh.testmain;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prathamesh.entities.CustomerEntity;
import com.prathamesh.entities.InventoryEntity;
import com.prathamesh.entities.TransactionEntity;

public class TestOnlineShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InventoryEntity i1=new InventoryEntity(1, "mobile", 4);
InventoryEntity i2=new InventoryEntity(2, "laptop", 2);
InventoryEntity i3=new InventoryEntity(3, "tv", 1);

List<InventoryEntity> listOfInventoryItems=new ArrayList();
listOfInventoryItems.add(i1);
listOfInventoryItems.add(i2);
listOfInventoryItems.add(i3);
		
CustomerEntity c1=new CustomerEntity(101,"firstcustomer",null);
CustomerEntity c2=new CustomerEntity(102,"secondcustomer",null);
CustomerEntity c3=new CustomerEntity(103,"thirdcustomer",null);
CustomerEntity c4=new CustomerEntity(104,"fourthcustomer",null);

List<CustomerEntity> listOfTransaction1Customers=new ArrayList();
listOfTransaction1Customers.add(c1);
listOfTransaction1Customers.add(c2);
List<CustomerEntity> listOfTransaction2Customers=new ArrayList();
listOfTransaction2Customers.add(c3);
listOfTransaction2Customers.add(c4);


TransactionEntity t1=new TransactionEntity(1001, listOfTransaction1Customers, listOfInventoryItems);
TransactionEntity t2=new TransactionEntity(1002,listOfTransaction1Customers , listOfInventoryItems);
TransactionEntity t3=new TransactionEntity(1003, listOfTransaction2Customers, listOfInventoryItems);

List<TransactionEntity> listOfCustomer1Transactions=new ArrayList();
listOfCustomer1Transactions.add(t2);
listOfCustomer1Transactions.add(t3);
List<TransactionEntity> listOfCustomer2Transactions=new ArrayList();
listOfCustomer2Transactions.add(t3);
listOfCustomer2Transactions.add(t1);
c1.setListOfTransactions(listOfCustomer1Transactions);
c2.setListOfTransactions(listOfCustomer2Transactions);


		
		Session s=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tr=s.beginTransaction();
		s.save(c1);
		s.save(c2);
		s.flush();
		tr.commit();
	}

}
