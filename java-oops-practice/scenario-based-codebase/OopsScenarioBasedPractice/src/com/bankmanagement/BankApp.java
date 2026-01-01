package com.bankmanagement;

public class BankApp
{
	public static void main(String[] args)
	{
		// Customer with Savings Account
		SavingsAccount savings = new SavingsAccount(5000, 5);
		Customer customer1 = new Customer("Rohan", savings);

		customer1.deposit(2000);
		customer1.withdraw(1500);
		savings.calculateInterest();
		customer1.checkBalance();

		System.out.println();

		// Customer with Current Account
		CurrentAccount current = new CurrentAccount(3000);
		Customer customer2 = new Customer("Amit", current);

		customer2.deposit(1000);
		customer2.withdraw(500);
		customer2.checkBalance();
	}
}

