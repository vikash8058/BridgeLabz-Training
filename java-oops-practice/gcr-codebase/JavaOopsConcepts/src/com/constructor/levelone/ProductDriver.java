package com.constructor.levelone;

class Product {

    // Instance Variables
    private String productName;
    private double price;

    // Class Variable
    private static int totalProducts = 0;

    // Parameterized Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance Method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class Method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class ProductDriver {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 55000);
        System.out.println("Product 1:");
        product1.displayProductDetails();

        Product product2 = new Product("Mobile", 25000);
        System.out.println("\nProduct 2:");
        product2.displayProductDetails();

        Product product3 = new Product("Headphones", 3000);
        System.out.println("\nProduct 3:");
        product3.displayProductDetails();

        System.out.println();
        Product.displayTotalProducts();
    }
}
