package com.sorting.fleetmanager;

public class Vehicle {

	//instance variable
	private String vehicleId;
	private int mileage;

	//constructor to initialize instance variable
	public Vehicle(String vehicleId, int mileage) {
		this.vehicleId = vehicleId;
		this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	@Override
	public String toString() {
		return vehicleId + " | Mileage: " + mileage;
	}
}
