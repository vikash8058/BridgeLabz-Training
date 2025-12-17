// program to find the side of square
import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        // Creating variable
        double perimeter;

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter perimeter of square: ");
        perimeter = input.nextDouble();

        // Calculating side
        double side = perimeter / 4;

        // Displaying result
        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter);

        input.close(); // Closing the Scanner object
    }
}
