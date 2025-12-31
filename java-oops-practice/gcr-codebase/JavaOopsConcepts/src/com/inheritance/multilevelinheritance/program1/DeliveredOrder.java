package com.inheritance.multilevelinheritance.program1;

//Subclass of ShippedOrder
public class DeliveredOrder extends ShippedOrder {

 // Additional Attribute
 private String deliveryDate;

 // Parameterized Constructor
 public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
     super(orderId, orderDate, trackingNumber);
     this.deliveryDate = deliveryDate;
 }

 // Method to get order status
 String getOrderStatus() {
     return "Order Delivered on " + deliveryDate;
 }

 // Display Order Details
 void displayOrderDetails() {
     System.out.println("Order ID: " + orderId);
     System.out.println("Order Date: " + orderDate);
     System.out.println("Tracking Number: " + trackingNumber);
     System.out.println("Delivery Date: " + deliveryDate);
     System.out.println("Status: " + getOrderStatus());
 }
}
