package com.groceryshoppingapp;

public abstract class Product {
	// Protected so subclasses can access
	protected String name;
	protected double price;
	protected String category;
	protected int quantity;

	// Constructor to initialize product details
	public Product(String name, double price, String category, int quantity) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
	}

	// Calculates total price for this product (price × quantity)
	public double calculatePrice() {
		return price * quantity;
	}

	// Polymorphic method – discount varies by product type
	public abstract double applyDiscount(double total);

	// Getter methods (no setters → encapsulation)
	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}
}
