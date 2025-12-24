//program for count vowels and consonants

import java.util.Scanner;
public class CountVowelAndConsonant{
             public static void countVowelAndConsonant(String text){
			    
	           String vowelAndConsonant="aeiouAEIOU";
			   int countVowel=0;
			   int countConsonant=0;
			   for(int i=0;i<text.length();i++){
			       char ch=text.charAt(i);
			      if(vowelAndConsonant.indexOf(ch)!=-1){
				     countVowel++;
				  }
				  else{
				     countConsonant++;
				  }
			   }
			   //display the result
			   System.out.println("CountOfVowel: "+countVowel+ "\nCountOfConsonant: "+countConsonant);
			   
			 
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
	   countVowelAndConsonant(text);
	          
	   }
}