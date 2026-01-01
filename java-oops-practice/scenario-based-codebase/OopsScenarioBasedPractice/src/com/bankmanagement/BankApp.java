package com.bankmanagement;

public class BankApp {
	public static void main(String[] args) {
		
		SavingsAccount savingAccount=new SavingsAccount("733802010005004", 50000, 6);
		savingAccount.calculateInterest();
		
		Customer customer1=new Customer(101,"Vishal Yadav",savingAccount);
		customer1.showBalance();
		customer1.depositMoney(23000);
		customer1.withdrawMoney(10000);
		
		System.out.println();
		
		//create object of current account
		CurrentAccount currentAccount=new CurrentAccount("733802010115045", 65000);
		currentAccount.getBalance();
		
		
		Customer customer2=new Customer(102, "Vikash Prajapati", currentAccount);
		customer2.withdrawMoney(5000);
		
	}
}
