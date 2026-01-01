package com.oopspillars.ecommerceplateform;

//Abstract class representing a generic Product
public abstract class Product {

	// Encapsulated fields
	private int productId;
	private String name;
	private double price;

	// Constructor to initialize product details
	public Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	// Getter and Setter methods (Encapsulation)
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Abstract method to calculate discount
	public abstract double calculateDiscount();
}
