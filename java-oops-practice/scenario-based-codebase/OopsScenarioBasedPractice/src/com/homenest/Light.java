package com.homenest;

public class Light extends Device implements IControllable {

	public Light(int deviceId) {
		super(deviceId);
	}

	@Override
	public void turnOn() {
		setStatus("ON");
		addEnergyUsage(5.0);
		System.out.println("Light ON");
	}

	@Override
	public void turnOff() {
		setStatus("OFF");
		System.out.println("Light OFF");
	}

	@Override
	public void reset() {
		System.out.println("Light reset: brightness set to default.");
	}
}
