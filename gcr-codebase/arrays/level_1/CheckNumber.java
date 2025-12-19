 //program to check number positive or negative then even or odd then equal or not equal
import java.util.Scanner;
public class CheckNumber{
       public static void main(String[]args){
         
        //declare variables
          int sizeOfArray;
         
        //create scanner object
          Scanner input=new Scanner(System.in);
       
        //take arraySize from user
          System.out.print("\nEnter size of array:");
          sizeOfArray=input.nextInt();
      
       //Create array name as age with size sizeOfArray
          int[]number=new int[sizeOfArray];
        
       //Take input age from user in age
         System.out.print("\nEnter value in array:");
         for(int i=0;i<sizeOfArray;i++){
              number[i]=input.nextInt();
        }
      
       //check number is positive,negative or zero
      
       for(int i=0;i<sizeOfArray;i++){
         
             if(number[i]<0){
                 System.out.println(number[i]+" is Negative Number");
               }
             else if (number[i]==0){
                 System.out.println(number[i]+" is Zero Number");      
              }else{
                  if(number[i]%2==0){
                      System.out.println(number[i]+" is Even Number");
                   }else{
                          System.out.println(number[i]+" is Odd Number"); 
                        }
            }
       }
     // compare first and last element
     if(number[0]>number[sizeOfArray-1]){
         System.out.println("first Element is greater");   
        }
     else if(number[0]<number[sizeOfArray-1]){
        System.out.println("Last element is greater");
        }else{
               System.out.println("First and Last Element is equal");
             }
       
}
}
