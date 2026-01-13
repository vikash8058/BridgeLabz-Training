package com.homenest;

public class Camera extends Device implements IControllable {

	public Camera(int deviceId) {
		super(deviceId);
	}

	@Override
	public void turnOn() {
		setStatus("ON");
		addEnergyUsage(10.0);
		System.out.println("Camera recording started.");
	}

	@Override
	public void turnOff() {
		setStatus("OFF");
		System.out.println("Camera turned OFF.");
	}

	@Override
	public void reset() {
		System.out.println("Camera reset: footage buffer cleared.");
	}
}
