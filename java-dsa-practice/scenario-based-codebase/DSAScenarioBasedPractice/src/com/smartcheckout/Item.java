package com.smartcheckout;

public class Item {

	// instance variable
	private double price;
	private int stock;

	// constructor to initialize instance variable
	public Item(double price, int stock) {
		this.price = price;
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	// method to reduce stock after purchase
	public void reduceStock(int quantity) {
		stock -= quantity;
	}

}
