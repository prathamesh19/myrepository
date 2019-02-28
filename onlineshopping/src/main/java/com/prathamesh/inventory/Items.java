package com.prathamesh.inventory;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
@Table(name="TableOfItems")
public class Items {

	@Id
	@Column(name="ID")
	private int itemId;
	@Column(name="NAME")
	private String itemName;
	@Column(name="QUANTITY")
	private int itemQuantity;
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items(int itemId, String itemName, int itemQuantity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", itemQuantity=" + itemQuantity + "]";
	}

	
}


interface InventoryService{
	boolean addItem(Items item);
	boolean updateItemQuantity(int id,int quantity);
	boolean deleteItem(int id);
	int getItemQuantity(int id);
	List<Items> getAllItems();
}


class InventoryServiceImpl implements InventoryService{

	public boolean addItem(Items item) {
		Session s=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tr=s.beginTransaction();
		s.save(item);
		s.flush();
		tr.commit();

		return false;
	}

	public boolean updateItemQuantity(int id,int quantity) {
		// TODO Auto-generated method stub
		Session s=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tr=s.beginTransaction();
		Items dbEntity=s.get(Items.class, id);
		dbEntity.setItemQuantity(quantity);
		s.save(dbEntity);
		s.flush();
		tr.commit();
		return false;
	}

	public boolean deleteItem(int id) {
		// TODO Auto-generated method stub
		Session s=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tr=s.beginTransaction();
		Items dbEntity=s.get(Items.class, id);
		s.evict(dbEntity);
		s.flush();
		tr.commit();
		return false;
	}

	public int getItemQuantity(int id) {
		// TODO Auto-generated method stub
		Session s=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tr=s.beginTransaction();
		Items dbEntity=s.get(Items.class, id);
		int numberOfItems=dbEntity.getItemQuantity();
		s.flush();
		tr.commit();
		return numberOfItems;
	}

	public List<Items> getAllItems() {
		// TODO Auto-generated method stub
		Session s=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tr=s.beginTransaction();
		
		s.flush();
		tr.commit();
		return null;
	}
	
}