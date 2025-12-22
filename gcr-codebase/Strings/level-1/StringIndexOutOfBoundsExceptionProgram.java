//program to demonstrate StringIndexOutOfBoundsException
import java.util.Scanner;
public class StringIndexOutOfBoundsExceptionProgram{
    
	     //generate exception
		  
		  public static void generateException(String text){
		     
			 //print String out of bound exception
			 for(int i=0;i<=text.length()+1;i++){
			   System.out.print(text.charAt(i));
			 }
		  }
		  
		  //handle the exception
		  
		  public static void handleException(String text){
		  
		  try{
		  
            for(int i=0;i<=text.length()+1;i++){
			   System.out.print(text.charAt(i));		   
		  }
		  }catch(StringIndexOutOfBoundsException e){
		    System.out.println("Exception handled: StringOutOfBoundExceptionoccurred.");
            System.out.println("Reason: Attempted to call a method on a out of bound object.");
		  
		  }
		  
		  
		  }
		  
       public static void main(String[]args){
	     
		//initialise variables
		String text1;
		
		//create scanner object
		Scanner input=new Scanner(System.in);
		
	    //take input from user
		System.out.println("\nEnter the text:");
		text1=input.next();
		
		  System.out.println("Calling method to generate exception:");
        try {
            generateException(text1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main method.");
        }

       //  Refactored approach - Call method that handles the exception
        System.out.println("\nCalling method to handle exception:");
        handleException(text1);
		
		
		
	   }

}