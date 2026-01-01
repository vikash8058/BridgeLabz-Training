package com.bankmanagement2;

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
			System.out.println("Deposit Successful. Balance: ₹" + balance);
		}
		else
		{
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount)
	{
		if (amount > 0 && amount <= balance)
		{
			balance -= amount;
			System.out.println("Withdrawal Successful. Balance: ₹" + balance);
		}
		else
		{
			System.out.println("Insufficient balance.");
		}
	}

	public double getBalance()
	{
		return balance;
	}
}
