package com.groceryshoppingapp;

import java.util.ArrayList;
import java.util.List;

// Cart class manages products and price calculations
public class Cart implements ICheckout {
	// Only Cart can modify totalPrice (encapsulation)
	private List<Product> products;
	private double totalPrice;
	private double discount;

	// Constructor – empty cart
	public Cart() {
		this.products = new ArrayList<>();
	}

	// Constructor – cart with pre-selected items
	public Cart(List<Product> products) {
		this.products = products;
	}

	// Add product to cart
	public void addProduct(Product product) {
		products.add(product);
	}

	// Calculates total price using operators
	private void calculateTotal() {
		totalPrice = 0;

		for (Product product : products) {
			totalPrice += product.calculatePrice();
		}
	}

	// Applies polymorphic discount logic
	@Override
	public void applyDiscount() {
		discount = 0;

		for (Product product : products) {
			discount += product.applyDiscount(product.calculatePrice());
		}
	}

	// Generates final bill
	@Override
	public void generateBill() {
		calculateTotal();
		applyDiscount();

		double finalAmount = totalPrice - discount;

		System.out.println("\n--- SwiftCart Bill ---");
		System.out.println("Total Price: ₹" + totalPrice);
		System.out.println("Discount: ₹" + discount);
		System.out.println("Final Amount: ₹" + finalAmount);
	}
}
