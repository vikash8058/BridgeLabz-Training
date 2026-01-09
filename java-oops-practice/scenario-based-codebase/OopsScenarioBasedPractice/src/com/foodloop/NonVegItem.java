package com.foodloop;

public class NonVegItem extends FoodItem {

	// instance variable
	private String meatType;

	// constructor to initialize the instance variable
	public NonVegItem(String name, double price, int availableStock, String meatType) {
		super(name, "Non-Veg", price, availableStock);
		this.meatType = meatType;
	}

	// method to display the details of food item
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Meat type: " + this.meatType);
	}

}
