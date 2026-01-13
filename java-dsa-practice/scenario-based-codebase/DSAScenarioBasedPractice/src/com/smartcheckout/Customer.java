package com.smartcheckout;

import java.util.HashMap;

public class Customer {

	// instance variable
	private String name;
	private HashMap<String, Integer> items = new HashMap<String, Integer>();

	// constructor to initialize instance variable
	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, Integer> getItems() {
		return items;
	}

	// method to add items
	public void addItem(String itemName, int quantity) {
		items.put(itemName, quantity);
	}

}
