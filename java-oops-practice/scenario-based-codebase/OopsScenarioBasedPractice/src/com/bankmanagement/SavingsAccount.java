package com.bankmanagement;

public class SavingsAccount extends Account{
	
	//instance variable
	protected double interestRate;
	
	//constructor to initialize instance variables
	public SavingsAccount(String accountNumber, double balance,double interestRate) {
		super(accountNumber,balance);
		this.interestRate=interestRate;
	}
	
	//method to calculate interest
	void calculateInterest() {
		double interest=this.balance*interestRate/100;
		this.balance=this.balance+interest;
		
		System.out.println("Interest Added: $" + interest);
		System.out.println("Updated Balance: $" + balance);
	}
}
