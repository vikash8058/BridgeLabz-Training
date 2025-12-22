// Program to convert the complete text to lowercase and compare the results

import java.util.Scanner;

public class ConvertToLowerCase {

    // Manual lowercase conversion using ASCII values
    public static String convertToLowerCaseManually(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Convert only uppercase characters to lowercase
            if (Character.isUpperCase(ch)) {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }

    // Built-in method conversion
    public static String convertToLowerCaseMethod(String text) {
        return text.toLowerCase();
    }

    // Compare both results
    public static boolean compareBothMethod(String text1, String text2) {
        return text1.equals(text2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        String manualResult = convertToLowerCaseManually(text);
        String methodResult = convertToLowerCaseMethod(text);

        System.out.println("Manual Conversion : " + manualResult);
        System.out.println("Method Conversion : " + methodResult);

        if (compareBothMethod(manualResult, methodResult)) {
            System.out.println("Result: True (Both methods match)");
        } else {
            System.out.println("Result: False (Mismatch)");
        }

        input.close();
    }
}
