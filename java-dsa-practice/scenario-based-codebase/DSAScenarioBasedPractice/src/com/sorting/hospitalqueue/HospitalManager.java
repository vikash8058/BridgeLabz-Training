package com.sorting.hospitalqueue;

public class HospitalManager {

	// bubble sort
	public void bubbleSort(Patient[] patients) {
		int n = patients.length;

		int counter = 1;
		while (counter <= n) {
			boolean swapped = false;
			for (int i = 0; i < n - counter; i++) {

				// compare adjacent elements by criticality
				if (patients[i].getCriticality() < patients[i + 1].getCriticality()) {
					Patient temp = patients[i];
					patients[i] = patients[i + 1];
					patients[i + 1] = temp;

					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}
			counter++;
		}
	}

	// display patients
	public void displayPatients(Patient[] patients) {
		for (Patient patient : patients) {
			System.out.println(patient.getName() + " (Criticality: " + patient.getCriticality() + ")");
		}
		System.out.println("-------------------------------------------------");
	}
}
