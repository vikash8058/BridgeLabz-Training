package com.oopspillars.ecommerceplateform;

//Main class to test the e-commerce platform
public class ECommercePlatform {

	public static void main(String[] args) {

		Product p1 = new Electronics(201, "Laptop", 60000);
		Product p2 = new Clothing(202, "Jacket", 4000);
		Product p3 = new Groceries(203, "Rice Bag", 1200);

		System.out.println("Electronics Discount: " + p1.calculateDiscount());
		System.out.println("Clothing Discount   : " + p2.calculateDiscount());
		System.out.println("Groceries Discount  : " + p3.calculateDiscount());

		Taxable t1 = (Taxable) p1;
		System.out.println(t1.getTaxDetails());
		System.out.println("Tax Amount: " + t1.calculateTax());
	}
}
