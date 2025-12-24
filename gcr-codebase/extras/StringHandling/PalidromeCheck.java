//program for palidrome check
import java.util.Scanner;
public class PalidromeCheck{
        public static boolean isPalidrome(String text){
		    int start=0;
			int end=text.length()-1;
			boolean flag=true;
			while(start<=end){
			    if(text.charAt(start)!=text.charAt(end))
				{
				      flag=false;
				      break;
				}
				start++;
				end--;
			  
			}
			return flag;
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
	  if(isPalidrome(text)){
		  System.out.println("String is palindrome");
	  }else{
		  System.out.println("String is not palindrome");
	  }
	  
	  input.close(); // Closing scanner stream        
	 
   }
}