package com.oopspillars.ecommerceplateform;

//Electronics product category
public class Electronics extends Product implements Taxable {

	// Constructor
	public Electronics(int productId, String name, double price) {
		super(productId, name, price);
	}

	// Discount calculation for electronics (10%)
	@Override
	public double calculateDiscount() {
		return getPrice() * 0.10;
	}

	// Tax calculation (18%)
	@Override
	public double calculateTax() {
		return getPrice() * 0.18;
	}

	// Tax details
	@Override
	public String getTaxDetails() {
		return "18% GST applicable on Electronics";
	}
}
