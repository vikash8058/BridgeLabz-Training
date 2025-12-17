// Program to calculate Sam's average percentage in PCM
public class SamAveragePCM{

    public static void main(String[] args) {

        // Declare and initialize marks
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        int totalMarks = mathsMarks + physicsMarks + chemistryMarks;   // Calculate total marks
        
        double averagePercentage = totalMarks / 3.0;     // Calculate average percentage

        System.out.println("Sam’s average mark in PCM is " + averagePercentage);    // Display the result
    }
}