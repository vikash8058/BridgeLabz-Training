// Program to store up to 10 positive numbers in an array


import java.util.Scanner;

public class SumOfAllNumber {
    public static void main(String[] args) {

        // Initialize variables
        double[] arr = new double[10];
        double totalValue = 0.0;
        int index = 0;

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Input loop
        while (index < arr.length) {

            System.out.print("Enter Number: ");
            double number = input.nextDouble();

            // Stop condition
            if (number <= 0) {
                break;
            }

            // Store value in array
            arr[index] = number;
            index++;
        }

        // Calculate sum of entered elements only
        for (int i = 0; i < index; i++) {
            totalValue += arr[i];
        }

        // Display result
        System.out.println("Total Value: " + totalValue);

        // Close scanner
        input.close();
    }
}
