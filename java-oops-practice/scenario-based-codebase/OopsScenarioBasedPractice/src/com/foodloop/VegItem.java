package com.foodloop;

public class VegItem extends FoodItem {

	// instance variable
	private boolean isOrganic;

	// constructor to initialize instance variable
	public VegItem(String name, double price, int availableStock, boolean isOrganic) {
		super(name, "Veg", price, availableStock);
		this.isOrganic = isOrganic;
	}

	// method to display the details of food item
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Organinc: " + isOrganic);
	}
}
