package com.groceryshoppingapp;

//Non-perishable products like grains, packaged items
public class NonPerishableProduct extends Product {
	public NonPerishableProduct(String name, double price, String category, int quantity) {
		super(name, price, category, quantity);
	}

	// Lower discount for non-perishable items
	@Override
	public double applyDiscount(double total) {
		return total * 0.05; // 5% discount
	}
}
