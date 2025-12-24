// Java program to count how many times a given substring occurs in a string
import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count substring occurrences
    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length(); // move forward
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Take user input
        System.out.print("Enter the main string: ");
        String inputString = input.nextLine();
	System.out.print("Enter the substring: ");
        String subString = input.nextLine();
		
        // Displaying the result
        int result = countOccurrences(inputString, subString);
        System.out.println("Substring occurs " + result + " times.");
        
		
        input.close();  // Closing scanner stream
    } 
}
