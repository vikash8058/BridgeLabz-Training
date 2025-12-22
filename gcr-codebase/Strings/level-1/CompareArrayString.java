// program to return all the characters in a string using the user-defined method,  compare the result 
 
 import java.util.Scanner;
 import java.util.Arrays;
 
 public class CompareArrayString{
             public static char[] userDefinedArrayString(String text){
			   //create an array for storing value manually
			     char[]text1=new char[text.length()];
				 
				 //create loop to iterate and store value of string in char array
				 for(int i=0;i<text.length();i++){
				   text1[i]=text.charAt(i);
				 }
				 return text1;
			 
			 }
			 public static char[] inBuiltArrayString(String text){
			    char[]text2=text.toCharArray();
				return text2;
			 }
			 public static boolean compareTwoArray(char[]text1,char[]text2){
			       return Arrays.equals(text1,text2);
			 }
        public static void main(String[]args){
		
		 //initialise variable
		 String text;
		 
		 //Create scanner object 
		 Scanner input=new Scanner(System.in);
		 
		 //take input from user-defined
		 System.out.println("Enter Text:");
		 text=input.next();
		 
		 
		 char[]text1=userDefinedArrayString(text);
		 
		 char[]text2=inBuiltArrayString(text);
		 
		 if(compareTwoArray(text1,text2)){
			 System.out.println("String are equals");
		 }else{
			 System.out.println("String are not equals");
		 }
		 
		 //close Scanner
		 input.close();
		 
		 
		}

 }