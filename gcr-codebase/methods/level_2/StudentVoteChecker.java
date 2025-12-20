//program to check whether students can vote
import java.util.Scanner;

public class StudentVoteChecker
{
	//method to check voting eligibility
	public boolean canStudentVote(int age)
	{
		//check for invalid age
		if(age<0)
		{
			return false;
		}

		//check voting condition
		if(age>=18)
		{
			return true;
		}

		return false;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//create object of class
		StudentVoteChecker checker=new StudentVoteChecker();

		//array to store age of students
		int age[]=new int[10];

		//take input and check voting eligibility
		for(int i=0;i<age.length;i++)
		{
			System.out.print("Enter age of student "+(i+1)+": ");
			age[i]=input.nextInt();

			if(checker.canStudentVote(age[i]))
			{
				System.out.println("Student can vote");
			}
			else
			{
				System.out.println("Student cannot vote");
			}
		}

		input.close(); //closing input stream
	}
}
