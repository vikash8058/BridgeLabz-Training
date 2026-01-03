package com.cabbygo;

public class SUV extends Vehicle implements IRideService {

	// defining rate and basefare as final
	private final double rate = 20;
	private final double baseFare = 100;

	// creating constructor to pass it super class
	public SUV(String vehicleNumber, int capacity) {
			super(vehicleNumber,capacity,"SUV");
		}

	@Override
	public void bookRide(int distance) {
		double totalFare = baseFare + distance * rate;
		setFare(totalFare);
		System.out.println("SUV ride booked");
	}

	@Override
	public void endRide() {
		System.out.println("SUV ride ended. Fare: " + getFare());
	}
}
