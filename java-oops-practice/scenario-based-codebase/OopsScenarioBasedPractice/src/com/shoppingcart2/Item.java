package com.shoppingcart2;

//Item class represents a single product in the shopping cart
//This is a CUSTOM CLASS because we are modeling a real-world object
public class Item
{
	// Private variables to follow encapsulation
	private int itemId;        // Unique ID of the item
	private String name;       // Name of the product
	private double price;      // Price per unit
	private int quantity;      // Quantity selected by customer

	// Constructor to initialize item details
	public Item(int itemId, String name, double price, int quantity)
	{
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Method to calculate total price of this item
	// (price × quantity)
	public double getTotalPrice()
	{
		return price * quantity;
	}

	// Getter methods (no setters to keep item immutable for now)
	public String getName()
	{
		return name;
	}

	public double getPrice()
	{
		return price;
	}

	public int getQuantity()
	{
		return quantity;
	}
}
