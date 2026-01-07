package com.parkease;

// Base class for all vehicles
public abstract class Vehicle implements IPayable {

	protected String vehicleNumber;
	protected double baseRate; // hourly rate

	public Vehicle(String vehicleNumber, double baseRate) {
		this.vehicleNumber = vehicleNumber;
		this.baseRate = baseRate;
	}
}
