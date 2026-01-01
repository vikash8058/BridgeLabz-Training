package com.bankmanagement2;

public class Customer
{
	private String customerName;
	private Account account;

	public Customer(String customerName, Account account)
	{
		this.customerName = customerName;
		this.account = account;
	}

	public void depositMoney(double amount)
	{
		account.deposit(amount);
	}

	public void withdrawMoney(double amount)
	{
		account.withdraw(amount);
	}

	public void showBalance()
	{
		System.out.println(customerName + "'s Balance: ₹" + account.getBalance());
	}
}
