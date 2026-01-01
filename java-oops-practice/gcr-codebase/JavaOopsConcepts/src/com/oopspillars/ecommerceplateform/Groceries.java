package com.oopspillars.ecommerceplateform;

//Groceries product category
public class Groceries extends Product {

	// Constructor
	public Groceries(int productId, String name, double price) {
		super(productId, name, price);
	}

	// Discount calculation for groceries (5%)
	@Override
	public double calculateDiscount() {
		return getPrice() * 0.05;
	}
}
