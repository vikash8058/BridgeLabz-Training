package com.mapinterface.shoppingcart;

import java.util.*;

class ShoppingCart {

	// stores product prices
	Map<String, Integer> priceMap = new HashMap<>();

	// maintains order of items added
	Map<String, Integer> cart = new LinkedHashMap<>();

	// add product to cart
	void addItem(String product, int price) {

		priceMap.put(product, price);
		cart.put(product, price);
	}

	// display items in insertion order
	void displayCart() {

		for (String item : cart.keySet()) {
			System.out.println(item + " -> " + cart.get(item));
		}
	}

	// display items sorted by price
	void displaySortedByPrice() {

		TreeMap<Integer, List<String>> sorted = new TreeMap<>();

		for (String item : cart.keySet()) {
			int price = cart.get(item);
			sorted.computeIfAbsent(price, k -> new ArrayList<>()).add(item);
		}

		for (int price : sorted.keySet()) {
			for (String item : sorted.get(price)) {
				System.out.println(item + " -> " + price);
			}
		}
	}
}
