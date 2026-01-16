package com.generics.smartwarehousemanagement;

public class SmartWarehouseSystem {

	public static void main(String[] args) {

		Storage<Electronics> electronicsStorage = new Storage<>();
		electronicsStorage.addItem(new Electronics("Laptop"));
		electronicsStorage.addItem(new Electronics("Mobile"));

		Storage<Groceries> groceriesStorage = new Storage<>();
		groceriesStorage.addItem(new Groceries("Rice"));
		groceriesStorage.addItem(new Groceries("Milk"));

		Storage<Furniture> furnitureStorage = new Storage<>();
		furnitureStorage.addItem(new Furniture("Table"));
		furnitureStorage.addItem(new Furniture("Chair"));

		System.out.println("---- Electronics ----");
		WarehouseUtil.displayItems(electronicsStorage.getItems());

		System.out.println("\n---- Groceries ----");
		WarehouseUtil.displayItems(groceriesStorage.getItems());

		System.out.println("\n---- Furniture ----");
		WarehouseUtil.displayItems(furnitureStorage.getItems());
	}
}
