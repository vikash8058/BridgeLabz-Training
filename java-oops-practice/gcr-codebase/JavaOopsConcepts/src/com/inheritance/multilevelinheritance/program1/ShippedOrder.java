package com.inheritance.multilevelinheritance.program1;

//Subclass of Order
public class ShippedOrder extends Order {

 // Additional Attribute
 protected String trackingNumber;

 // Parameterized Constructor
 public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
     super(orderId, orderDate);
     this.trackingNumber = trackingNumber;
 }

 // Method to get order status
 String getOrderStatus() {
     return "Order Shipped";
 }
}

