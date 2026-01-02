package com.hospitalmanagement;

public abstract class Patient {

	//instance variable
	private int patientId;
	private String name;
	private String medicalHistory;
	protected Doctor assignedDoctor;
	
	//constructor for normal admission
	public Patient(int patientId, String name) {
		this.patientId = patientId;
		this.name = name;
	}
	
	//overloaded constructor for emergency admission
	public Patient(int patientId, String name, String medicalHistory) {
		this.patientId=patientId;
		this.name=name;
		this.medicalHistory=medicalHistory;
	}
	
	//no direct setter for medical history
	public String getSummary() {
		return "Patient ID          : "+patientId+"\nName                : "+name;
	}
	
	//assign doctor
	public void assignDoctor(Doctor doctor) {
		this.assignedDoctor=doctor;
	}
	
	//abstract method to display info
	public abstract void displayInfo();
}
