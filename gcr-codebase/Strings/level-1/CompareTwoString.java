//program to compare two strings

import java.util.Scanner;
public class CompareTwoString{
        public static boolean compareStrings(String text1, String text2){
		      //initialise boolean variable 
			  if(text1.length()!=text2.length()){
				  return false;
			  }
			  boolean flag=false;
			  for(int i=0;i<text1.length();i++){
			     if(text1.charAt(i)==text2.charAt(i)){
				        flag=true;
				 }else{
				       flag=false;
					   return flag;
					   
				 }
			  }
			    return flag;
		}
  public static void main(String[]args){
    
	 // initialise variables
	  String text1;
	  String text2;
	 
    //create Scanner file
     
     Scanner input=new Scanner(System.in);
	 
	 //take input from user
	 System.out.println("\nEnter text1:");
	 text1=input.next();
	  System.out.println("\nEnter text2:");
	 text2=input.next();
	 //call the methods
	 
	  System.out.println("Result Using CharAt method:");
	 if(compareStrings(text1,text2)){
	       System.out.println("Given string are equals");
	 }else{
	      System.out.println("Given String are not equals");
	   }
	 
	//if you want to use equals method then
    System.out.println("Result Using Equals method:");
	System.out.println(text1.equals(text2)? "String are equals":"String are not equals");
	 
	 //close the Scanner
	 input.close();
  }
}