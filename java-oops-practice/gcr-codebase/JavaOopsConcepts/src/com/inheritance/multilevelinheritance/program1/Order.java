package com.inheritance.multilevelinheritance.program1;

//Base Class
public class Order {

 // Attributes
 protected String orderId;
 protected String orderDate;

 // Parameterized Constructor
 public Order(String orderId, String orderDate) {
     this.orderId = orderId;
     this.orderDate = orderDate;
 }

 // Method to get order status
 String getOrderStatus() {
     return "Order Placed";
 }
}

