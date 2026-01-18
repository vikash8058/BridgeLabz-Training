package com.mapinterface.insurancepolicy;

import java.time.LocalDate;

public class InsuranceSystem {

	public static void main(String[] args) {

		PolicyManager manager = new PolicyManager();

		manager.addPolicy(new Policy(101, "Amit", LocalDate.now().plusDays(10), "Health", 5000));

		manager.addPolicy(new Policy(102, "Ravi", LocalDate.now().plusDays(40), "Auto", 3000));

		manager.addPolicy(new Policy(103, "Amit", LocalDate.now().plusDays(20), "Home", 7000));

		manager.addPolicy(new Policy(104, "Neha", LocalDate.now().minusDays(5), "Health", 4500));

		System.out.println("---- All Policies ----");
		manager.displayAll();

		System.out.println("\n---- Get Policy 102 ----");
		System.out.println(manager.getPolicy(102));

		System.out.println("\n---- Expiring in 30 Days ----");
		manager.expiringSoon();

		System.out.println("\n---- Policies for Amit ----");
		manager.policiesByHolder("Amit");

		System.out.println("\n---- Removing Expired Policies ----");
		manager.removeExpired();

		System.out.println("\n---- Policies After Removal ----");
		manager.displayAll();
	}
}
