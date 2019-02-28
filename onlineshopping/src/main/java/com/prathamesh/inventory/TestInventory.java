package com.prathamesh.inventory;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Items i1=new Items(101,"LAPTOP",30);
Items i2=new Items(102,"MOBILE",10);
Items i3=new Items(103,"TELEVISION",40);
		
InventoryService iService=new InventoryServiceImpl();
iService.addItem(i1);
iService.addItem(i2);
iService.addItem(i3);
	}

}
