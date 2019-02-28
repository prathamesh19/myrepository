package com.prathamesh.onetoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table
public class Transaction {

	@Id
	private int transactionId;
private List<Customer> listOfCustomers=new ArrayList();
private List<Inventory> litOfItems=new ArrayList();
}
