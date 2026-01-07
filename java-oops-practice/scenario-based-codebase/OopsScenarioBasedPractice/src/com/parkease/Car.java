package com.parkease;

// Car vehicle type
public class Car extends Vehicle {

	public Car(String vehicleNumber) {
		super(vehicleNumber, 50); // ₹50 per hour
	}

	// Polymorphic charge calculation
	@Override
	public double calculateCharges(int hours) {
		double penalty = (hours > 5) ? 100 : 0;
		return (baseRate * hours) + penalty;
	}
}
