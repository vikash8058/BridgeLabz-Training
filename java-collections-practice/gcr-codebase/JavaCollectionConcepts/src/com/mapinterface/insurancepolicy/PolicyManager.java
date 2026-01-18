package com.mapinterface.insurancepolicy;

import java.time.LocalDate;
import java.util.*;

class PolicyManager {

	// quick lookup by policy number
	Map<Integer, Policy> hashMap = new HashMap<>();

	// insertion order maintained
	Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();

	// sorted by expiry date
	TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

	// add policy
    void addPolicy(Policy p) {

        hashMap.put(p.policyNumber, p);
        linkedHashMap.put(p.policyNumber, p);

        treeMap
            .computeIfAbsent(p.expiryDate, k -> new ArrayList<>())
            .add(p);
    }

    // retrieve policy by number
    Policy getPolicy(int policyNumber) {
        return hashMap.get(policyNumber);
    }

    // policies expiring in next 30 days
    void expiringSoon() {

        LocalDate now = LocalDate.now();
        LocalDate limit = now.plusDays(30);

        for (LocalDate date : treeMap.keySet()) {
            if (!date.isBefore(now) && !date.isAfter(limit)) {
                for (Policy p : treeMap.get(date)) {
                    System.out.println(p);
                }
            }
        }
    }

    // policies by policyholder name
    void policiesByHolder(String name) {

        for (Policy p : hashMap.values()) {
            if (p.holderName.equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    // remove expired policies
    void removeExpired() {

        LocalDate now = LocalDate.now();
        Iterator<Map.Entry<Integer, Policy>> it =
                hashMap.entrySet().iterator();

        while (it.hasNext()) {
            Policy p = it.next().getValue();
            if (p.expiryDate.isBefore(now)) {
                it.remove();
                linkedHashMap.remove(p.policyNumber);
            }
        }

        treeMap.headMap(now).clear();
    }

    // display all policies
    void displayAll() {
        for (Policy p : linkedHashMap.values()) {
            System.out.println(p);
        }
    }
}
