package com.budgetwise;

public class Transaction {

	private double amount;
	private String type; // INCOME or EXPENSE
	private String date;
	private String category;

	// constructor to initialize transaction
	public Transaction(double amount, String type, String date, String category) {
		this.amount = amount;
		this.type = type;
		this.date = date;
		this.category = category;
	}

	// getter methods (encapsulation)
	public double getAmount() {
		return amount;
	}

	public String getType() {
		return type;
	}

	public String getCategory() {
		return category;
	}
}
