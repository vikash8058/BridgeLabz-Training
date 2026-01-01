package com.bankmanagement;

public class Account
{
	protected double balance;

	public Account(double balance)
	{
		this.balance = balance;
	}

	public void deposit(double amount)
	{
		if (amount > 0)
		{
			balance += amount;
			System.out.println("Deposited: ₹" + amount);
		}
	}

	public void withdraw(double amount)
	{
		if (amount > 0 && amount <= balance)
		{
			balance -= amount;
			System.out.println("Withdrawn: ₹" + amount);
		}
		else
		{
			System.out.println("Insufficient balance.");
		}
	}

	public void showBalance()
	{
		System.out.println("Current Balance: ₹" + balance);
	}
}
