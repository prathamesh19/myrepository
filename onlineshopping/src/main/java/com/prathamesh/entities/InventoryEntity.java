package com.prathamesh.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class InventoryEntity {

	@Id
	int itemId;
	String itemName;
	int itemQuantity;
	
	public InventoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InventoryEntity(int itemId, String itemName, int itemQuantity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
	}
	@Override
	public String toString() {
		return "InventoryEntity [itemId=" + itemId + ", itemName=" + itemName + ", itemQuantity=" + itemQuantity + "]";
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
}
