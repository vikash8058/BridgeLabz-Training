//Remove duplicate from string 
import java.util.Scanner;
public class DuplicateString{
         public static String removeDuplicate(String text){
		      String modifiedString="";
			  for(int i=0;i<text.length();i++){
			        char ch=text.charAt(i);
				   if(!modifiedString.contains(String.valueOf(ch))){
					   modifiedString+=ch;
				   }
				   
			  }
			  return modifiedString;
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
	    System.out.println("old String:"+text);
		System.out.println("Modified String: "+removeDuplicate(text));
	          
	      
	   }
}