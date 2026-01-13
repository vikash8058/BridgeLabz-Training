package com.payexpress;

public abstract class Bill {

	// bill details
	private String type;
	private double amount;
	private String dueDate;
	private boolean isPaid;

	// internal payment details
	protected double latePenalty = 50.0;

	// constructor to create recurring bill
	public Bill(String type, double amount, String dueDate) {
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
		this.isPaid = false;
	}

	// protected method to mark bill as paid
	protected void markAsPaid() {
		isPaid = true;
	}

	// protected method to calculate late fee
	protected double calculateLateFee(boolean isLate) {
		if (isLate) {
			return amount + latePenalty;
		}
		return amount;
	}

	// getters 
	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public String getDueDate() {
		return dueDate;
	}

	public boolean isPaid() {
		return isPaid;
	}

	// abstract reminder method
	public abstract void sendReminder();
}
