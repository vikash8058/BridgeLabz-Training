//program to print multiplication table of a number
import java.util.Scanner;
public class MultiplicationProgram {
       public static void main(String[]args) {
         
        //declare variables
          int sizeOfArray;
          int number;
        //create scanner object
          Scanner input=new Scanner(System.in);
       
        //take arraySize from user and number
          System.out.print("\nEnter size of array:");
          sizeOfArray=input.nextInt();
          System.out.println("\nEnter number to find table:");
           number=input.nextInt();
      
       //Create array name as age with size sizeOfArray
          int[]arr=new int[sizeOfArray];
        
      
       //store multiplication value in array
           for(int i=1;i<=10;i++){
            arr[i-1]=number*i;

             System.out.println(number +"*"+i+" = "+arr[i-1]);
       
       
       
   }

}







































        
 