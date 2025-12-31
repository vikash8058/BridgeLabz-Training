package com.inheritance.multilevelinheritance.program1;


public class OrderDriver {
    public static void main(String[] args) {

        DeliveredOrder order = new DeliveredOrder("ORD101","10-Aug-2025","TRK98765","15-Aug-2025");
        System.out.println("Online Retail Order Details:");
        order.displayOrderDetails();
    }
}
