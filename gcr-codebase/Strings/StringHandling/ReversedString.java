//program for reverse string

import java.util.Scanner;
public class ReversedString{
             public static void reverseStringMethod(String text){
			    
	           String reverseString="";
			   for(int i=text.length()-1;i>=0;i--){
			         reverseString+=text.charAt(i);
			      
			   }
			   //display the result
			   System.out.println("ReversedString: "+reverseString);
			   
			 
			 }
       public static void main(String[]args){
	   
	   //initialise variable
	   String text;
	  
	   //create scanner object
	   
	   Scanner input=new Scanner(System.in);
	   
	   //take input from user
	   
	   System.out.println("Enter the string:");
	   text=input.nextLine();
	   
	   //call the methods 
	   reverseStringMethod(text);
	          
	   }
}