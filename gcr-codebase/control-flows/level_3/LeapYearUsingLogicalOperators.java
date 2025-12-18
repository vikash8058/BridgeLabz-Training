// program to check whether a year is a leap year or not using single if condition

import java.util.Scanner;

public class LeapYearUsingLogicalOperators{
   public static void main(String[]args){
       
       //Initialize variables
         int year;
       
         Scanner input=new Scanner(System.in);
         
      // Take input from users
         System.out.print("\nEnter Year:");
         year=input.nextInt();
         
      // Check valid Gregorian calendar year
         if(year>=1582){
             
             // check leap year using logical operators
             if((year%4==0 && year%100!=0) || year%400==0){
                 System.out.println("Year is a Leap Year");
             }else{
                 System.out.println("Year is not a Leap Year");
             }
             
         }else{
             System.out.println("Year should be greater than or equal to 1582");
         }
         //close the scanner
         input.close();
  }
}
