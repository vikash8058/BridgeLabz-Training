package com.smartcheckout;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SmartCheckoutManager {

	// queue for customers
	private Queue<Customer> customerQueue = new LinkedList<>();

	// item name → Item (price + stock)
	private HashMap<String, Item> itemMap = new HashMap<>();

	// add items to store
	public void addItemStore(String name, double price, int quantity) {
		itemMap.put(name, new Item(price, quantity));
	}

	// add customer to queue
	public void addCustomer(Customer customer) {
		customerQueue.offer(customer);
		System.out.println(customer.getName() + " joined the queue");
	}

	// process next customer
	public void processBilling() {
		if (customerQueue.isEmpty()) {
			System.out.println("No customers in queue.");
			return;
		}

		Customer customer = customerQueue.poll();
		double total = 0;
		System.out.println("\nBilling customer: " + customer.getName());

		for (String itemName : customer.getItems().keySet()) {
			int quantity = customer.getItems().get(itemName);
			Item item = itemMap.get(itemName);

			if (item == null) {
				System.out.println(itemName + " is not available");
				continue;
			}

			if (item.getStock() < quantity) {
				System.out.println(itemName + " out of stock");
				continue;
			}

			double cost = item.getPrice() * quantity;
			total += cost;

			item.reduceStock(quantity);
			System.out.println(itemName + " x " + quantity + " = " + cost);

		}
		System.out.println("Total Bill: " + total);

	}
}
