package com.bankmanagement;

public class Customer
{
	private String name;
	private Account account;

	public Customer(String name, Account account)
	{
		this.name = name;
		this.account = account;
	}

	public void deposit(double amount)
	{
		account.deposit(amount);
	}

	public void withdraw(double amount)
	{
		account.withdraw(amount);
	}

	public void checkBalance()
	{
		System.out.print(name + " - ");
		account.showBalance();
	}
}
