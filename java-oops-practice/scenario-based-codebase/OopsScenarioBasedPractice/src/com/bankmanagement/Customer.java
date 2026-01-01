package com.bankmanagement;

public class Customer {
	
	//instance variable
	protected int customerId;
	protected String customerName;
	protected Account account;
	
	//constructor to initialize instance variables
	public Customer(int customerId, String customerName, Account account) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.account = account;
	}
	
	//method to deposit amount
	void depositMoney(double amount) {
		account.deposit(amount);
	}
	
	//method to withdraw amount
	void withdrawMoney(double amount) {
		account.withdraw(amount);
	}
	
	//method to display balance
	void showBalance() {
		account.getBalance();
	}
	
}
