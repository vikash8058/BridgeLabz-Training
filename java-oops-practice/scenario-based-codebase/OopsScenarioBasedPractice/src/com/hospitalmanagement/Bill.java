package com.hospitalmanagement;

public class Bill implements Payable {

	// instance variable
	private double baseAmount;
	private double tax;
	private double discount;

	// constructor to initialize only base amount
	public Bill(double baseAmount) {
		this.baseAmount = baseAmount;
	}

	@Override
	public void calculatePayment() {
		tax=baseAmount*0.05; //5% tax
		discount=baseAmount>5000 ? baseAmount*0.10 :0 ;
		double totalBill=baseAmount+tax-discount; 
		
		System.out.println("Base Amount         : "+this.baseAmount);
		System.out.println("Tax                 : "+this.tax);
		System.out.println("Discount            : "+this.discount);
		System.out.println("Total payable amount: "+totalBill);
		System.out.println("--------------------------------------------------------------");
	}
}
