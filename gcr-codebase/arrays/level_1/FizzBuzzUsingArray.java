//program for Fizzbuzz using array for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz"

import java.util.Scanner;

public class FizzBuzzUsingArray
{
	public static void main(String[] args)
	{
		//create a Scanner object
		Scanner input=new Scanner(System.in);
		
		//get an input value for number
		int number=input.nextInt();
		
		//check the number is positive or not
		if(number>0)
		{
			String array[]=new String[number]; //create an array of size of number 
			
			for(int i=0;i<array.length;i++)
			{
				
				if((i+1)%15==0)  //if index is divisible by 3 and 5 then store it as "FizzBuzz"
				{
					array[i]="FizzBuzz";
				}
				else if((i+1)%3==0)   //if index is divisible by 3 then store it as "Fizz"
				{
					array[i]="Fizz";
				}
				else if((i+1)%5==0)   //if index is divisible by 5 then store it as "Buzz"
				{
					array[i]="Buzz";
				}
				
				else    //if number is not divisible any of case then store its same value
				{
					array[i]=String.valueOf(i+1);
				}
			}
			for(int i=0;i<array.length;i++)  //displaying result
			{
				System.out.println("Position "+ (i+1) +" = "+array[i]);
			}
		}
		
		input.close();  //closing input stream
	}
}