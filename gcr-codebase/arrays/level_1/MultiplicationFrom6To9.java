// program to find the multiplication table of a number entered by the user from 6 to 9
import java.util.Scanner;
public class MultiplicationFrom6To9 {
    public static void main(String[]args) {
     
      //initialise variable 
        int number;
      
      //create Scanner object
    
       Scanner input=new Scanner(System.in);
     
      //take input from user
      
        number=input.nextInt();
         
      //create an array to store multiplication result
     
        int[]result=new int[4];
      
      //result to store in array
        for(int i=6;i<=9;i++){
           result[i-6]=i*number;
           System.out.println(number+" * "+ i+" = "+ result[i-6]);
         }
    
    //close the scanner
      input.close();


 }
}