package com.smartcheckout;

public class SmartCheckoutApp {
	public static void main(String[] args) {

		SmartCheckoutManager manager = new SmartCheckoutManager();

		// add item to store
		manager.addItemStore("Milk", 50, 10);
		manager.addItemStore("Bread", 30, 5);
		manager.addItemStore("Eggs", 12, 20);

		// create customers
		Customer customer1 = new Customer("Vishal");
		customer1.addItem("Milk", 2);
		customer1.addItem("Bread", 4);

		Customer customer2 = new Customer("Anuj");
		customer2.addItem("Eggs", 12);
		customer2.addItem("Milk", 109);

		// add customers to queue
		manager.addCustomer(customer1);
		manager.addCustomer(customer2);

		manager.processBilling();
		manager.processBilling();
		manager.processBilling();
	}
}
