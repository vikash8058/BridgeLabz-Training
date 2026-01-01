package com.oopspillars.ecommerceplateform;

//Clothing product category
public class Clothing extends Product implements Taxable {

	// Constructor
	public Clothing(int productId, String name, double price) {
		super(productId, name, price);
	}

	// Discount calculation for clothing (20%)
	@Override
	public double calculateDiscount() {
		return getPrice() * 0.20;
	}

	// Tax calculation (12%)
	@Override
	public double calculateTax() {
		return getPrice() * 0.12;
	}

	// Tax details
	@Override
	public String getTaxDetails() {
		return "12% GST applicable on Clothing";
	}
}
