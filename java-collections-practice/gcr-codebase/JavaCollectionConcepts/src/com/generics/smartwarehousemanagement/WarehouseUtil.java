package com.generics.smartwarehousemanagement;

import java.util.List;

class WarehouseUtil {

	public static void displayItems(List<? extends WarehouseItem> items) {
		for (WarehouseItem item : items) {
			System.out.println("Item Name: " + item.getName() + " | Category: " + item.getCategory());
		}
	}
}
