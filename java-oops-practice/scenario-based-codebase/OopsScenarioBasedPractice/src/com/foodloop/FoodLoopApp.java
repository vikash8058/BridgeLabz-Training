package com.foodloop;

import java.util.Scanner;

public class FoodLoopApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creating an order
        System.out.print("Enter Order ID: ");
        int orderId = scanner.nextInt();

        Order order = new Order(orderId);

        int choice;

        do {
            System.out.println("\n===== Food Menu =====");
            System.out.println("1. Add Veg Item");
            System.out.println("2. Add Non-Veg Item");
            System.out.println("3. Place Order");
            System.out.println("4. Cancel Order");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // Veg item input
                    System.out.print("Enter Veg Item Name: ");
                    String vegName = scanner.nextLine();

                    System.out.print("Enter Price: ");
                    double vegPrice = scanner.nextDouble();

                    System.out.print("Enter Stock: ");
                    int vegStock = scanner.nextInt();

                    System.out.print("Is Organic (true/false): ");
                    boolean isOrganic = scanner.nextBoolean();

                    VegItem vegItem = new VegItem(vegName, vegPrice, vegStock, isOrganic);
                    order.addFoodItem(vegItem);

                    System.out.println("Veg item added to order.");
                    break;

                case 2:
                    // Non-Veg item input
                    System.out.print("Enter Non-Veg Item Name: ");
                    String nonVegName = scanner.nextLine();

                    System.out.print("Enter Price: ");
                    double nonVegPrice = scanner.nextDouble();

                    System.out.print("Enter Stock: ");
                    int nonVegStock = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    System.out.print("Enter Meat Type: ");
                    String meatType = scanner.nextLine();

                    NonVegItem nonVegItem =
                            new NonVegItem(nonVegName, nonVegPrice, nonVegStock, meatType);

                    order.addFoodItem(nonVegItem);

                    System.out.println("Non-Veg item added to order.");
                    break;

                case 3:
                    // Place order
                    order.placeOrder();
                    break;

                case 4:
                    // Cancel order
                    order.cancelOrder();
                    break;

                case 0:
                    System.out.println("Thank you for using FoodLoop!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
