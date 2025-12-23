//program for longest word in sentence

import java.util.Scanner;
public class LongestWord{
         public static String longestWord(String text){
		      String longestWord="";
			  String[]words=text.split(" ");
			  int max=0;
			  for(int i=0;i<words.length;i++){
			       if(max<words[i].length()){
				      max=words[i].length();
					  longestWord=words[i];
				   }
			  }
			  return longestWord;
		 }
       public static void main(String[]args){
	   //initialise variable
	   String text;
	  
	   //create scanner object
	   
	   Scanner input=new Scanner(System.in);
	   
	   //take input from user
	   
	   System.out.println("Enter the string:");
	   text=input.nextLine();
	   
	   System.out.println("Longest Word: "+ longestWord(text));
	
	      
	   }
}
