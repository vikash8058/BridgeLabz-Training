package com.junittesting.calculator;
public class Calculator {

    // Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts second number from first
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides first number by second
    public int divide(int a, int b) {
        return a / b; // Throws ArithmeticException if b is zero
    }
}
