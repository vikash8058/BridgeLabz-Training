// Java program to toggle the case of each character in a given string
import java.util.Scanner;

public class ToggleCase {

    // Method to toggle case
    public static String toggleCase(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32); // convert to lowercase
            } 
            else if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32); // convert to uppercase
            } 
            else {
                result = result + ch; // keep as it is
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Take user input
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        
		// Display the result
        String outputString = toggleCase(inputString);
        System.out.println("Toggled string: " + outputString);
        
		
        input.close(); // Scanning scanner stream
    }
}
