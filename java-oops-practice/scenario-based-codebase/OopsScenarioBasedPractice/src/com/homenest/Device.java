package com.homenest;

public abstract class Device {

	// instance variable
	private int deviceId;
	private String status;
	private double energyUsage;

	// protected firmware log
	protected String firmwareLog;

	public Device(int deviceId) {
		this.deviceId = deviceId;
		this.status = "OFF";
		this.energyUsage = 0.0;
		this.firmwareLog = "Firmware v1.0 installed";
	}

	// protected method to update status
	protected void setStatus(String status) {
		this.status = status;
	}

	// public getter methods
	public int getDeviceId() {
		return deviceId;
	}

	public String getStatus() {
		return status;
	}

	public double getEnergyUsage() {
		return energyUsage;
	}
	
	//method for energy calculation
	protected void addEnergyUsage(double units) {
		energyUsage+=units;
	}
	
	//abstract reset method
	public abstract void reset();
}








