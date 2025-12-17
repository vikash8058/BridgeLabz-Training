// Writing Java Code to calculate total purchase price
import java.util.Scanner;
public class PurchasePrice {
    public static void main(String[] args) {
        // Creating variables
        double unitPrice;
        int quantity;

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter unit price: ");
        unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        // Calculating total price
        double totalPrice = unitPrice * quantity;

        // Displaying result
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity +
                           " and unit price is INR " + unitPrice);

        input.close(); // Closing the Scanner object
    }
}
