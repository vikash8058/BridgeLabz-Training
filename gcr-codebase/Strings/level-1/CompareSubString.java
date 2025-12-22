//program to create a substring from a String using the charAt() method

import java.util.Scanner;
public class CompareSubString{
       public static boolean compareSubtring(String text,int startIndex,int endIndex){
	       //create substring variable name as text2
		   String text2="";
		   
		   //find substring and add them in text2 using charAt method
		   
		   for(int i=startIndex;i<endIndex;i++){
		       text2+=text.charAt(i);
		   }
          //find substring using substring method
		  
		  String text3=text.substring(startIndex,endIndex);
		  
		  return text2.equals(text3);
	   }
    public static void main(String[]args){
	  
	    //initialise variable
		String text;
		int startIndex;
		int endIndex;
	    
		// create scanner object
		Scanner input=new Scanner(System.in);
		
		//take input from users
		System.out.print("\nEnter text: ");
		text=input.next();
		
		//take index from users
			System.out.print("\nEnter enter startIndex: ");
		startIndex=input.nextInt();
			System.out.print("\nEnter enter endIndex: ");
		endIndex=input.nextInt();
		
		//call the method
		
		if(compareSubtring(text,startIndex,endIndex)){
			System.out.println("substring are equals");
		}else{
			System.out.println("substring are not equals");
		}
		//close the Scanner
		input.close();
		
	}
}