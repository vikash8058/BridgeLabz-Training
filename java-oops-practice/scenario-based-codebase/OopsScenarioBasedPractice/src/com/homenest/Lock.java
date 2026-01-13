package com.homenest;

public class Lock extends Device implements IControllable {

	public Lock(int deviceId) {
		super(deviceId);
	}

	@Override
	public void turnOn() {
		setStatus("LOCKED");
		addEnergyUsage(2.0);
		System.out.println("Door locked.");
	}

	@Override
	public void turnOff() {
		setStatus("UNLOCKED");
		System.out.println("Door unlocked.");
	}

	@Override
	public void reset() {
		System.out.println("Lock reset: security settings restored.");
	}
}
