package com.parkease;

// Bike vehicle type
public class Bike extends Vehicle {

	public Bike(String vehicleNumber) {
		super(vehicleNumber, 20); // ₹20 per hour
	}

	@Override
	public double calculateCharges(int hours) {
		double penalty = (hours > 6) ? 50 : 0;
		return (baseRate * hours) + penalty;
	}
}
