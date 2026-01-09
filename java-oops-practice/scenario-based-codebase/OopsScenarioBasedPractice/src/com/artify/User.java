package com.artify;

public class User {
	
	//private data members
	private String name;
	private double walletBalance;
	
	public User(String name, double walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance;
	}

	public void deductBalance(double amount) {
		if(amount>0 && amount<=walletBalance) {
			walletBalance-=amount;
			System.out.println("Amount has been deducted : "+amount);
			return;
		}
		else {
			System.out.println("Invalid amount or Insufficient wallet balance");
			return;
		}
	}
	
	//return the wallet balance
	public double getWalletBalance() {
		return this.walletBalance;
	}
}
