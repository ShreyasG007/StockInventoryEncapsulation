package com.tka.encapsulation;

public class TestInventory {
	public static void main(String[] args) {
		StockInventory inventory = new StockInventory();
		
		inventory.setProdId(1);
		inventory.setProdName("Mobile Phones");
		inventory.setProdInventory(1000);
		
		System.out.println("Product Id : "+inventory.getProdId());
		System.out.println("Product Name : "+inventory.getProdName());
		System.out.println("Product Inventory : "+inventory.getProdInventory());
		
		System.out.println();
		inventory.AddInventory(-20);
		inventory.AddInventory(1000);
		
		System.out.println();
		inventory.SaleInventory(10000);
		inventory.SaleInventory(-200);
		inventory.SaleInventory(100);
	}
}
