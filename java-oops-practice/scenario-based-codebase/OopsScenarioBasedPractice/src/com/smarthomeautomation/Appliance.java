package com.smarthomeautomation;

//Base class Appliance
public class Appliance {

	// Internal device settings (Encapsulation)
	private boolean powerStatus;
	private int powerUsage;

	// Constructor with default power settings
	public Appliance() {
		this.powerUsage = 0;
		this.powerStatus = false;
	}

	// Constructor with user-defined power settings
	public Appliance(int powerUsage) {
		this.powerUsage = powerUsage;
		this.powerStatus = false;
	}

	// Protected getters for subclasses
	protected boolean isPowerOn() {
		return powerStatus;
	}

	protected int getPowerUsage() {
		return powerUsage;
	}

	// Protected setters for controlled access
	protected void setPowerStatus(boolean status) {
		this.powerStatus = status;
	}
}
