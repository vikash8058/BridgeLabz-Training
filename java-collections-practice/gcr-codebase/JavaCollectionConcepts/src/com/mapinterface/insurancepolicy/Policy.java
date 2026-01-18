package com.mapinterface.insurancepolicy;

import java.time.LocalDate;

class Policy {

	int policyNumber;
	String holderName;
	LocalDate expiryDate;
	String coverageType;
	double premium;

	Policy(int policyNumber, String holderName, LocalDate expiryDate, String coverageType, double premium) {

		this.policyNumber = policyNumber;
		this.holderName = holderName;
		this.expiryDate = expiryDate;
		this.coverageType = coverageType;
		this.premium = premium;	
	}

	public String toString() {
		return policyNumber + " | " + holderName + " | " + expiryDate + " | " + coverageType + " | " + premium;
	}
}
