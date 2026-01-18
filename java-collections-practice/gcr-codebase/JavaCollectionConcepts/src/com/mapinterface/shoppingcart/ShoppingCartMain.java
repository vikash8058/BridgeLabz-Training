package com.mapinterface.shoppingcart;

public class ShoppingCartMain {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();

		cart.addItem("Apple", 100);
		cart.addItem("Banana", 40);
		cart.addItem("Milk", 60);
		cart.addItem("Bread", 50);

		System.out.println("---- Cart (Insertion Order) ----");
		cart.displayCart();

		System.out.println("\n---- Cart (Sorted by Price) ----");
		cart.displaySortedByPrice();
	}
}
