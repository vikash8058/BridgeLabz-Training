package com.cabbygo;

public class Sedan extends Vehicle implements IRideService{
	
	//defining rate and basefare as final
	private final double rate=15;
	private final double baseFare=80;
	
	//creating constructor to pass it super class
	public Sedan(String vehicleNumber, int capacity) {
		super(vehicleNumber,capacity,"Sedan");
	}
	
	
	@Override
	public void bookRide(int distance) {
		double totalFare=baseFare + distance * rate ;
		setFare(totalFare);
		System.out.println("Sedan ride booked");
	}
	
	@Override
	public void endRide() {
		System.out.println("Sedan ride ended. Fare: "+getFare());
	}
}
