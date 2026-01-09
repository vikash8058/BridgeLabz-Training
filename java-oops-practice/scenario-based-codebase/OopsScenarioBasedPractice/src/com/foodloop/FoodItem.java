package com.foodloop;

public class FoodItem {

	// instance variable
	private String name;
	private String category;
	private double price;
	private int availableStock;

	// define constructor to initialize instance variable
	public FoodItem(String name, String category, double price, int availableStock) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.availableStock = availableStock;
	}

	// method to check availability
	public boolean isAvailable() {
		return availableStock > 0;
	}

	// method to return the name of food item
	public String getName() {
		return this.name;
	}

	// method to find the price of food item
	public double getPrice() {
		return price;
	}

	//method to reduce the the stock
	public void reduceStock(int quantity) {
		if(quantity<=availableStock) {
			availableStock-=quantity;
		}
	}
	
	//method to display item details
	public void displayDetails() {
		System.out.println("Item: "+this.name);
		System.out.println("Category: "+this.category);
		System.out.println("Price: $"+this.price);
	}
}
