package com.objectmodeling;

class Customer{
	
	//instance variables
	protected String customerName;
	protected int accountNumber;
	protected double balance;
	
	//constructor to initialize instance variables
	public Customer(String customerName, int accountNumber, double balance) {
		this.customerName=customerName;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	//method to view account balance
	void viewBalance() {
		System.out.println("Customer Name: "+this.customerName);
		System.out.println("Account Number: "+this.accountNumber);
		System.out.println("Balance: "+this.balance);
	}
}

class Bank{
	
	//instance variable
	protected String bankName;
	
	//constructor to initialize instance variable
	public Bank(String bankName) {
		this.bankName=bankName;
	}
	
	//method to open account for customer
	void openAccount(Customer customer) {
		System.out.println("Account opened in: "+this.bankName);
		System.out.println("Customer: "+customer.customerName);
		System.out.println("Account Number is: "+customer.accountNumber);
	}
}

public class BankAndAccountHolders {
	public static void main(String[] args) {
		
		//create bank object
		Bank bank1=new Bank("HDFC Bank");
		Bank bank2=new Bank("Axis Bank");
		
		//create customer object 
		Customer customer=new Customer("Vikash Prajapati",221211,15000);
		
		//open account for customer in different bank
		bank1.openAccount(customer);
		System.out.println();
		bank2.openAccount(customer);
		System.out.println();
		
		//calling method to view balance
		customer.viewBalance();
	}
}
