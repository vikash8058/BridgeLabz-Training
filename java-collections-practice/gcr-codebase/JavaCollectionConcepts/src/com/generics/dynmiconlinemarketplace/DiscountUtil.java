package com.generics.dynmiconlinemarketplace;

class DiscountUtil {

	public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

		double discountAmount = product.getPrice() * (percentage / 100);
		product.setPrice(product.getPrice() - discountAmount);
	}
}
