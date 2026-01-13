package com.homenest;

public class Thermostat extends Device implements IControllable {

	public Thermostat(int deviceId) {
		super(deviceId);
	}

	@Override
	public void turnOn() {
		setStatus("ON");
		addEnergyUsage(20.0);
		System.out.println("Thermostat ON: maintaining temperature.");
	}

	@Override
	public void turnOff() {
		setStatus("OFF");
		System.out.println("Thermostat OFF.");
	}

	@Override
	public void reset() {
		System.out.println("Thermostat reset: temperature set to 24°C.");
	}
}
