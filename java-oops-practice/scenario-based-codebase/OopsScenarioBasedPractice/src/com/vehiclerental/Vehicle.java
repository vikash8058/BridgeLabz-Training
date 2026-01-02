package com.vehiclerental;

// base class
public class Vehicle {

	// instance variable
	protected String vehicleId;
	protected double baseRate;
	protected String vehicleName;

	// constructor
	public Vehicle(String vehicleId, double baseRate,String vehicleName) {
		this.vehicleId = vehicleId;
		this.baseRate = baseRate;
		this.vehicleName=vehicleName;
	}

	// Getter methods (Encapsulation)
	public String getVehicleId() {
		return vehicleId;
	}

	public double getBaseRate() {
		return baseRate;
	}

	public String getVehicleName() {
		return vehicleName;
	}
	
	// Setter methods
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
}
