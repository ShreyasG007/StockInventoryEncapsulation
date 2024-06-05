package com.tka.encapsulation;

public class StockInventory {
	private int prodId;
	private String prodName;
	private int prodInventory;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdInventory() {
		return prodInventory;
	}

	public void setProdInventory(int prodInventory) {
		this.prodInventory = prodInventory;
	}

	public void AddInventory(int inventory) {
		if (inventory <= 0) {
			System.out.println("Please enter valid count of inventory");
		} else {
			this.prodInventory+= inventory;
			System.out.println("Added Inventory Successful !!!");
			System.out.println("Updated Inventory : " + this.prodInventory);
		}
	}

	public void SaleInventory(int inventory) {
		if (this.prodInventory < inventory) {
			System.out.println("Product Inventory is insufficient");
		} else if (inventory <= 0) {
			System.out.println("Please Enter valid count of inventory");
		} else {
			this.prodInventory -= inventory;
			System.out.println("Sale Successful !!!");
			System.out.println("Remaining Inventory : " + this.prodInventory);
		}
	}

}
