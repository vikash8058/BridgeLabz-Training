package com.generics.dynmiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

class ProductCatalog {

	private List<Product<? extends Category>> catalog = new ArrayList<>();

	public void addProduct(Product<? extends Category> product) {
		catalog.add(product);
	}

	public void showCatalog() {
		for (Product<? extends Category> product : catalog) {
			product.display();
		}
	}
}
