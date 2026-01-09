package com.foodloop;

import java.util.ArrayList;
import java.util.List;

public class Customer implements IOrderable {

	// instance variable
	private int orderId;
	private List<FoodItem> foodItem;
	private double totalAmount;
	private double discount;
	private String orderStatus;

	// constructor
	public Customer(int orderId) {
		this.orderId = orderId;
		this.foodItem = new ArrayList<>();
		this.orderStatus = "Created";
	}

	// method to add food item for order
	public void addFoodItem(FoodItem item) {
		if (item.isAvailable()) {
			foodItem.add(item);
			totalAmount += item.getPrice();
			item.reduceStock(1);
		}
	}

	// method to add discount
	public void applyDiscount() {
		if (totalAmount >= 1000) {
			discount = totalAmount * 0.15;
		} else if (totalAmount >= 500) {
			discount = totalAmount * 0.10;
		} else {
			discount = totalAmount * 0.5;
		}
	}

	// method to calculate final amount
	public double calculateFinalAmount() {
		applyDiscount();
		return totalAmount - discount;
	}

	// method to place the order
	@Override
	public void placeOrder() {
		this.orderStatus = "PLACED";
		System.out.println("Order ID: " + this.orderId);
		System.out.println("Order Status: " + this.orderStatus);
		System.out.println("Total payable amount: " + calculateFinalAmount());
	}

	// Cancels the order
	@Override
	public void cancelOrder() {
		orderStatus = "CANCELLED";
		System.out.println("Order ID       : " + orderId);
		System.out.println("Order Status   : " + orderStatus);
	}
}
