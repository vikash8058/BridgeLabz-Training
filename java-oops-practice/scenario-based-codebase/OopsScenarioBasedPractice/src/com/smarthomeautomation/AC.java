package com.smarthomeautomation;

//AC appliance
public class AC extends Appliance implements Controllable {

	public AC(int powerUsage) {
		super(powerUsage);
	}

	@Override
	public void turnOn() {
		setPowerStatus(true);
		System.out.println("AC turned ON with cooling mode");
	}

	@Override
	public void turnOff() {
		setPowerStatus(false);
		System.out.println("AC turned OFF");
	}
}
