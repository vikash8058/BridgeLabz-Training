package com.smarthomeautomation;

//Fan appliance
public class Fan extends Appliance implements Controllable {

	public Fan(int powerUsage) {
		super(powerUsage);
	}

	@Override
	public void turnOn() {
		setPowerStatus(true);
		System.out.println("Fan turned ON");
	}

	@Override
	public void turnOff() {
		setPowerStatus(false);
		System.out.println("Fan turned OFF");
	}
}
