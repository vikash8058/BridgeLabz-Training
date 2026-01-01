package com.bankmanagement2;

public class SavingsAccount extends Account
{
	private double interestRate;

	public SavingsAccount(double balance, double interestRate)
	{
		super(balance);
		this.interestRate = interestRate;
	}

	public void calculateInterest()
	{
		double interest = balance * interestRate / 100;
		balance += interest;

		System.out.println("Interest Added: ₹" + interest);
		System.out.println("Updated Balance: ₹" + balance);
	}
}
