package com.vehiclerental;

//Car class inheriting Vehicle
public class Car extends Vehicle implements Rentable {

	// Constructor specific to Car
	public Car(String vehicleId, double baseRate,String vehicleName) {
		super(vehicleId, baseRate,vehicleName);
	}

	// Rent calculation for Car (includes surcharge)
	@Override
	public double calculateRent(int days) {
		return (baseRate * days) + 500;
	}
}
