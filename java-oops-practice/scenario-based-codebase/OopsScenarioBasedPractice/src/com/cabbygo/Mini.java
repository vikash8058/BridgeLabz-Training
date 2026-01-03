package com.cabbygo;

public class Mini extends Vehicle implements IRideService{
	
	private final double rate=10;
	private final double baseFare=50;
	
	public Mini(String vehicleNumber, int capacity) {
		super(vehicleNumber,capacity,"Mini");
	}
	
	@Override
	public void bookRide(int distance) {
		double totalFare=baseFare + distance * rate ;
		setFare(totalFare);
		System.out.println("Sedan ride booked");
	}
	
	@Override
	public void endRide() {
		System.out.println("Mini ride ended. Fare: "+getFare());
	}
	
}
