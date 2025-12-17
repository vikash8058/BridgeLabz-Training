//program to find the distance in yards and miles
import java.util.Scanner;
public class DistanceConversion {
    public static void main(String[] args) {
        // Creating variable
        double distanceInFeet;

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();

        // Calculations
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        // Displaying result
        System.out.println("The distance in yards is " + yards +
                           " while the distance in miles is " + miles);

        input.close(); // Closing the Scanner object
    }
}
