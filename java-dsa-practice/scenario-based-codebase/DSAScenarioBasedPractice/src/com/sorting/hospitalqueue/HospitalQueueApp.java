package com.sorting.hospitalqueue;

public class HospitalQueueApp {
	public static void main(String[] args) {
		Patient[] patients= {
				new Patient("Vishal",2),
				new Patient("Anuj",8),
				new Patient("Vikash",4),
				new Patient("Anupam",12),
				new Patient("Virendra",9)
				};
		
		HospitalManager manager=new HospitalManager();
		
		//display the patient details before sorting 
		System.out.println("Before Sorting");
		manager.displayPatients(patients);
		
		//sort the patient according to criticality
		manager.bubbleSort(patients);
		
		//display the patient details after sorting 
		System.out.println("After Sorting");
		manager.displayPatients(patients);
		
	}
}
