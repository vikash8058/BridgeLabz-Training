package com.setinterface.insurancepolicy;

import java.time.LocalDate;
import java.util.*;

public class InsuranceSystem {

	public static void main(String[] args) {

		PolicyManager manager = new PolicyManager();

		Policy p1 = new Policy(101, "Amit", LocalDate.now().plusDays(10), "Health", 5000);

		Policy p2 = new Policy(102, "Ravi", LocalDate.now().plusDays(40), "Auto", 3000);

		Policy p3 = new Policy(103, "Neha", LocalDate.now().plusDays(20), "Home", 7000);

		Policy p4 = new Policy(101, "Amit", LocalDate.now().plusDays(10), "Health", 5000);

		manager.addPolicy(p1);
		manager.addPolicy(p2);
		manager.addPolicy(p3);
		manager.addPolicy(p4);

		System.out.println("---- All Unique Policies ----");
		manager.displayAllPolicies();

		System.out.println("\n---- Expiring Within 30 Days ----");
		manager.expiringSoon();

		System.out.println("\n---- Health Policies ----");
		manager.byCoverage("Health");

		System.out.println("\n---- Duplicate Policies ----");
		manager.findDuplicates(Arrays.asList(p1, p2, p3, p4));

		System.out.println("\n---- Performance Comparison ----");
		manager.performanceTest(p1);
	}
}
