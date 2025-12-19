//program to calculate percentage and grade of students
import java.util.Scanner;

public class StudentGradeCalculation
{
	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//take input for number of students
		System.out.print("Enter number of students: ");
		int number=input.nextInt();

		//create arrays to store marks, percentage and grade
		int physics[]=new int[number];
		int chemistry[]=new int[number];
		int maths[]=new int[number];
		double percentage[]=new double[number];
		char grade[]=new char[number];

		//take input for marks
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter marks for student "+(i+1));

			System.out.print("Physics: ");
			physics[i]=input.nextInt();

			System.out.print("Chemistry: ");
			chemistry[i]=input.nextInt();

			System.out.print("Maths: ");
			maths[i]=input.nextInt();

			//check for negative marks
			if(physics[i]<0 || chemistry[i]<0 || maths[i]<0)
			{
				i--;
			}
		}

		//calculate percentage and grade
		for(int i=0;i<number;i++)
		{
			int total=physics[i]+chemistry[i]+maths[i];
			percentage[i]=total/3.0;

			//assign grade based on percentage
			if(percentage[i]>=80)
			{
				grade[i]='A';
			}
			else if(percentage[i]>=70)
			{
				grade[i]='B';
			}
			else if(percentage[i]>=60)
			{
				grade[i]='C';
			}
			else if(percentage[i]>=50)
			{
				grade[i]='D';
			}
			else if(percentage[i]>=40)
			{
				grade[i]='E';
			}
			else
			{
				grade[i]='R';
			}
		}

		//display marks, percentage and grade
		System.out.println("\nStudent Result:");
		for(int i=0;i<number;i++)
		{
			System.out.println("Student "+(i+1));
			System.out.println("Physics: "+physics[i]);
			System.out.println("Chemistry: "+chemistry[i]);
			System.out.println("Maths: "+maths[i]);
			System.out.println("Percentage: "+percentage[i]);
			System.out.println("Grade: "+grade[i]);
			System.out.println();
		}

		input.close();  //closing input stream
	}
}
