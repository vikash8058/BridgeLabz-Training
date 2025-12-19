//program to check the student can vote or not by their age using array
import java.util.Scanner;

public class CanVoteUsingArray
{
	public static void main(String[] args)
	{
		//create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		//declaring an array of 10 student's age 
		int age[]=new int[10];
		
		//taking the input value of age of a student
		for(int i=0;i<age.length;i++)
		{
			age[i]=input.nextInt();
		}
		
		//checking the student's age is eligible to vote or not and displaying the result
		for(int i=0;i<age.length;i++)
		{
			if(age[i]>=18)
			{
				System.out.println("The student with the age "+age[i]+" can vote.");
			}
			else if(age[i]<18 && age[i]>=0)
			{
				System.out.println("The student with the age "+age[i]+" cannot vote.");
			}
			else
			{
				System.err.println(age[i] +" is a Invalid age");
			}
		}
	}
}