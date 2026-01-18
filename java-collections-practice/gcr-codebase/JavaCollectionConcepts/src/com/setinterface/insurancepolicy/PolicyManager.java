package com.setinterface.insurancepolicy;

import java.time.LocalDate;
import java.util.*;

class PolicyManager {

	Set<Policy> hashSet = new HashSet<>();
	Set<Policy> linkedHashSet = new LinkedHashSet<>();

	// TreeSet with Comparator (sorted by expiry date)
	Set<Policy> treeSet = new TreeSet<>((p1, p2) -> p1.expiryDate.compareTo(p2.expiryDate));

	// adding policy to all sets
	public void addPolicy(Policy p) {
		hashSet.add(p);
		linkedHashSet.add(p);
		treeSet.add(p);
	}

	// display all unique policies
	public void displayAllPolicies() {
		for (Policy p : hashSet) {
			System.out.println(p);
		}
	}

	// policies expiring within next 30 days
	public void expiringSoon() {
		LocalDate now = LocalDate.now();
		for (Policy p : treeSet) {
			if (!p.expiryDate.isAfter(now.plusDays(30))) {
				System.out.println(p);
			}
		}
	}

	// policies by coverage type
	public void byCoverage(String type) {
		for (Policy p : hashSet) {
			if (p.coverageType.equalsIgnoreCase(type)) {
				System.out.println(p);
			}
		}
	}

	// duplicate policies based on policy number
	public void findDuplicates(List<Policy> list) {
		Set<Integer> seen = new HashSet<>();
		for (Policy p : list) {
			if (!seen.add(p.policyNumber)) {
				System.out.println("Duplicate: " + p);
			}
		}
	}

	// performance comparison
	public void performanceTest(Policy testPolicy) {

		long start, end;

		start = System.nanoTime();
		hashSet.contains(testPolicy);
		end = System.nanoTime();
		System.out.println("HashSet search time: " + (end - start));

		start = System.nanoTime();
		linkedHashSet.contains(testPolicy);
		end = System.nanoTime();
		System.out.println("LinkedHashSet search time: " + (end - start));

		start = System.nanoTime();
		treeSet.contains(testPolicy);
		end = System.nanoTime();
		System.out.println("TreeSet search time: " + (end - start));
	}
}
