package com.payexpress;

public class WaterBill extends Bill implements IPayable {

	public WaterBill(double amount, String dueDate) {
		super("Water", amount, dueDate);
	}

	@Override
	public void pay(boolean isLate) {
		double finalAmount = calculateLateFee(isLate);
		markAsPaid();
		System.out.println("Water bill paid: " + finalAmount);
	}

	@Override
	public void sendReminder() {
		System.out.println("Water Reminder: Clear dues to ensure uninterrupted supply.");
	}
}
