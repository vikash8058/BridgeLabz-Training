package com.oopspillars.bankingsystem;

//Interface for loan-related operations
public interface Loanable {

	// Apply for loan
	void applyForLoan(double loanAmount);

	// Calculate loan eligibility
	boolean calculateLoanEligibility();
}
