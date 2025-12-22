//program to demonstrate NullPointerException

public class NullPointerExceptionProgram {

     //Generates NullPointerException
    public static void generateException() {
        String text = null;   // text initialized to null

        // This line will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    //Handles NullPointerException using try-catch
    public static void handleException() {
        String text = null;   // text initialized to null

        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception handled: NullPointerException occurred.");
            System.out.println("Reason: Attempted to call a method on a null object.");
        }
    }

    public static void main(String[] args) {

        // Call method that generates the exception
        System.out.println("Calling method to generate exception:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main method.");
        }

       //  Refactored approach - Call method that handles the exception
        System.out.println("\nCalling method to handle exception:");
        handleException();
    }
}
