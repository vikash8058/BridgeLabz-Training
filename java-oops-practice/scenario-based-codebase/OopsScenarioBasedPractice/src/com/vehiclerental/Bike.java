package com.vehiclerental;

//Bike class inheriting Vehicle
public class Bike extends Vehicle implements Rentable {

	// Constructor specific to Bike
	public Bike(String vehicleId, double baseRate,String vehicleName) {
		super(vehicleId,baseRate, vehicleName);
	}

	// Rent calculation for Bike
	@Override
	public double calculateRent(int days) {
		return baseRate * days;
	}
}
