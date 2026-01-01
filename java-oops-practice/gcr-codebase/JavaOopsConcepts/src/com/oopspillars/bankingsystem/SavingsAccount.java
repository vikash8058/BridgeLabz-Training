package com.oopspillars.bankingsystem;

//Savings account with higher interest rate
public class SavingsAccount extends BankAccount implements Loanable {

	private double requestedLoanAmount;

	// Constructor
	public SavingsAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	// Interest calculation for savings account (4%)
	@Override
	public double calculateInterest() {
		return getBalance() * 0.04;
	}

	// Apply for loan
	@Override
	public void applyForLoan(double loanAmount) {
		this.requestedLoanAmount = loanAmount;
	}

	// Loan eligibility based on balance
	@Override
	public boolean calculateLoanEligibility() {
		return getBalance() >= requestedLoanAmount * 0.5;
	}
}
