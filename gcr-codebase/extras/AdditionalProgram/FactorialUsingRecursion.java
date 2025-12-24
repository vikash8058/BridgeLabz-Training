import java.util.Scanner;

public class FactorialUsingRecursion {

    // Recursive method to calculate factorial
    public static long factorial(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        long result = factorial(number);

        System.out.println("Factorial: " + result);

        input.close(); //closing input stream
    }
}
