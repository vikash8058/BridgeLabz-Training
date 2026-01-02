package com.hospitalmanagement;

public class HospitalManagement {
	public static void main(String[] args) {
		
		Doctor doctor1=new Doctor(221211,"Dr. Saurabh","Cardiology");
		Doctor doctor2=new Doctor(221219, "Dr. Arpit", "Physician");
		
		Patient patient1=new InPatient(221041,"Anuj" ,"Heart Issue", 5);
		patient1.assignDoctor(doctor1);
		
		Bill bill1=new Bill(50000); //for patient 1 
		patient1.displayInfo();
		bill1.calculatePayment();
		
		
		Bill bill2=new Bill(4700);
		Patient patient2=new OutPatient(221042,"Anupam");
		patient2.assignDoctor(doctor2);
		patient2.displayInfo();
		bill2.calculatePayment();
		
		
	}
}
