package com.groceryshoppingapp;

//Main class to test SwiftCart application
public class SwiftCartApp {
	public static void main(String[] args) {
		// Create products
		Product apple = new PerishableProduct("Apple", 100, "Fruits", 2);

		Product rice = new NonPerishableProduct("Rice", 60, "Grains", 5);

		// Create cart
		Cart cart = new Cart();

		// Add products to cart
		cart.addProduct(apple);
		cart.addProduct(rice);

		// Checkout
		cart.generateBill();
	}
}
