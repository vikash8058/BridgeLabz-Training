package com.oopspillars.bankingsystem;

//Current account with lower interest rate
public class CurrentAccount extends BankAccount implements Loanable {

	private double requestedLoanAmount;

	// Constructor
	public CurrentAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	// Interest calculation for current account (2%)
	@Override
	public double calculateInterest() {
		return getBalance() * 0.02;
	}

	// Apply for loan
	@Override
	public void applyForLoan(double loanAmount) {
		this.requestedLoanAmount = loanAmount;
	}

	// Loan eligibility based on balance
	@Override
	public boolean calculateLoanEligibility() {
		return getBalance() >= requestedLoanAmount;
	}
}
