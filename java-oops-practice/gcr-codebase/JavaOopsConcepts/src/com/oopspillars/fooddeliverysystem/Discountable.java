package com.oopspillars.fooddeliverysystem;

//Interface for discount-related operations
public interface Discountable {

	// Apply discount on total price
	double applyDiscount();

	// Get discount details
	String getDiscountDetails();
}
