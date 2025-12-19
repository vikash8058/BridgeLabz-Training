// Program to store odd and even numbers into separate arrays


import java.util.Scanner;

public class StoreEvenAndOddNumber {
    public static void main(String[] args) {

        // Declare variables
        int number;

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter number: ");
        number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Error! Please enter a positive number.");
            input.close();
            return;
        }

        // Create arrays for even and odd numbers
        int size = (number / 2) + 1;
        int[] even = new int[size];
        int[] odd = new int[size];

        int indexEven = 0;
        int indexOdd = 0;

        // Store numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[indexEven++] = i;
            } else {
                odd[indexOdd++] = i;
            }
        }

        // Display even numbers
        System.out.print("Even Numbers: ");
        for (int i = 0; i < indexEven; i++) {
            System.out.print(even[i] + " ");
        }

        // Display odd numbers
        System.out.print("\nOdd Numbers: ");
        for (int i = 0; i < indexOdd; i++) {
            System.out.print(odd[i] + " ");
        }

        // Close scanner
        input.close();
    }
}
