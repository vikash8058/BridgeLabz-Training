package com.hospitalmanagement;

public class Doctor {

	private int doctorId;
	private String name;
	private String specialization;

	public Doctor(int doctorId, String name, String specialization) {
		this.doctorId = doctorId;
		this.name = name;
		this.specialization = specialization;
	}

	// Polymorphic-style display
	public String getDoctorInfo() {
		return doctorId+" "+ name + " (" + specialization + ")";
	}

}
