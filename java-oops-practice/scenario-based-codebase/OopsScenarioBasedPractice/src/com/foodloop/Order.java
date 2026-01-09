package com.foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

	private int orderId;
	private List<FoodItem> foodItems;
	private double totalAmount;
	private double discount;
	private String orderStatus;

	// Constructor
	public Order(int orderId) {
		this.orderId = orderId;
		this.foodItems = new ArrayList<>();
		this.orderStatus = "CREATED";
	}

	// Adds food item to order
	public void addFoodItem(FoodItem item) {
		if (item.isAvailable()) {
			foodItems.add(item);
			totalAmount += item.getPrice();
			item.reduceStock(1);
		}
	}

	// Applies discount based on total amount (Polymorphism-ready)
	public void applyDiscount() {
		if (totalAmount >= 1000) {
			discount = totalAmount * 0.15;
		} else if (totalAmount >= 500) {
			discount = totalAmount * 0.10;
		} else {
			discount = totalAmount * 0.05;
		}
	}

	// Calculates final total using operators
	public double calculateFinalAmount() {
		applyDiscount();
		return totalAmount - discount;
	}

	// Places the order
	@Override
	public void placeOrder() {
		orderStatus = "PLACED";
		System.out.println("Order ID       : " + orderId);
		System.out.println("Order Status   : " + orderStatus);
		System.out.println("Final Amount   : ₹" + calculateFinalAmount());
	}

	// Cancels the order
	@Override
	public void cancelOrder() {
		orderStatus = "CANCELLED";
		System.out.println("Order ID       : " + orderId);
		System.out.println("Order Status   : " + orderStatus);
	}
}
