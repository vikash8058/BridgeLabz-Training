package com.javakeywords;

public class BankAccount {
	//static variable shared across the program
	private static String bankName="State Bank of India";
	private static int totalAccounts=0; 
	private String accountHolderName;
	private  final String accountNumber;
	private double balance;
	
	//constructor using this to avoid ambiguity
	public BankAccount( String accountHolderName,String accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;  //final variable assigned only once
		this.balance = balance;
		totalAccounts++;  //static variable
	}
	
	//method to return total number of accounts
	public static void getTotalAccounts() {
		System.out.println("Total number of accounts: "+totalAccounts);
	}
	
	//method to display account details
	public void displayAccountDetails() {
		 // Using instanceof to check if the object is a BankAccount instance
		if(this instanceof BankAccount) {
			System.out.println("Bank Name: " + bankName);
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: $" + balance);
		}
		else {
			System.out.println("Invalid account instance.");
		}
	}
	
	//Getter and Setters
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName=accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	
	//method to deposit amount
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("deposited: $"+amount);
		}
		else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	//method to withdraw amount
	public void withdraw(double amount) {
		if (amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Withdrwn: $"+amount);
		}
		else {
			System.out.println("Insufficient balance or inavalid amount.");
		}
	}
	
	//main method for testing
	public static void main(String[] args) {
		
		//create two bank accounts
		BankAccount account1=new BankAccount("Vikash Prajapati","733802010005004",100000.00);
		BankAccount account2=new BankAccount("Vishal Yadav","733802010005856",500000.00);
		
		//display account details
		System.out.println("\nAccount 1 Details:");
	    account1.displayAccountDetails();
       	System.out.println("\nAccount 2 Details:");
       	account2.displayAccountDetails();
       	// Check total accounts
       	BankAccount.getTotalAccounts();
       	// Deposit and withdraw operations
       	System.out.println("\nPerforming transactions on Account 1:");
       	account1.deposit(200);
       	account1.withdraw(150);
       	account1.displayAccountDetails();
       	account2.displayAccountDetails();
       	account2.deposit(100);
       	account2.withdraw(800);
	}
}































