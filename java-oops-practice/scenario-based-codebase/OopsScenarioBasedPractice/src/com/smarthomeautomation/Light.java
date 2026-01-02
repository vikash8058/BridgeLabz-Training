package com.smarthomeautomation;

//Light appliance
public class Light extends Appliance implements Controllable {

	public Light(int powerUsage) {
		super(powerUsage);
	}

	@Override
	public void turnOn() {
		setPowerStatus(true);
		System.out.println("Light turned ON");
	}

	@Override
	public void turnOff() {
		setPowerStatus(false);
		System.out.println("Light turned OFF");
	}
}
