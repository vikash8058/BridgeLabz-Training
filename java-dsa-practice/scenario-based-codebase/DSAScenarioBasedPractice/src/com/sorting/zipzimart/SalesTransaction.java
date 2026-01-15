package com.sorting.zipzimart;

public class SalesTransaction {

	// instance variable
	private String date;
	private int amount;

	// constructor to initialize the instance variable
	public SalesTransaction(String date, int amount) {
		this.date = date;
		this.amount = amount;
	}

	// getter
	public int getAmount() {
		return amount;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Date: " + this.date + ", Amount: " + this.amount;
	}

}
