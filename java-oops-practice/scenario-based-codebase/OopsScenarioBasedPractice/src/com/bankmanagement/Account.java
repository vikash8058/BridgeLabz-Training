package com.bankmanagement;

public class Account {
	
	//instance variable
	protected String accountNumber;
	protected double balance;
	
	//constructor to initialize instance variables
	public Account(String accountNumber, double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	//method to deposit amount
	void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Amount successfully creadited: "+amount);
			System.out.println("Your current balance is: "+this.balance);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	
	//method to withdraw amount
	void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Amount successfully debited: "+amount);
			System.out.println("Your current balance is: "+this.balance);
		}else {
			System.out.println("Invalid amount or insufficient balance");
		}
	}
	
	//method to display balance
	void getBalance() {
		System.out.println("Your current balance is: "+this.balance);
	}
}
