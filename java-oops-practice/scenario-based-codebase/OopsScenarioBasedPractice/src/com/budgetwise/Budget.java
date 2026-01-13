package com.budgetwise;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Budget {

	protected double income;
	protected double limit;

	// category-wise spending limits
	protected HashMap<String, Double> categoryLimits = new HashMap<>();

	// list of transactions (restricted access)
	private ArrayList<Transaction> transactions = new ArrayList<>();

	// constructor for monthly / yearly budget
	public Budget(double income, double limit) {
		this.income = income;
		this.limit = limit;
	}

	// add category limit
	public void addCategoryLimit(String category, double limit) {
		categoryLimits.put(category, limit);
	}

	// add transaction (controlled access)
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}

	// calculate total expenses
	protected double calculateTotalExpenses() {
		double total = 0;
		for (Transaction t : transactions) {
			if (t.getType().equalsIgnoreCase("EXPENSE")) {
				total += t.getAmount();
			}
		}
		return total;
	}

	// calculate net savings using operators
	protected double calculateNetSavings() {
		return income - calculateTotalExpenses();
	}

	// get all transactions (protected access)
	protected ArrayList<Transaction> getTransactions() {
		return transactions;
	}
}
