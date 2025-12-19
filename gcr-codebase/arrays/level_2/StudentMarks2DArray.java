//program to calculate percentage and grade using 2-D array
import java.util.Scanner;

public class StudentMarks2DArray
{
	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//number of students
		int students=3;

		//create 2-D array for marks [student][subject]
		int marks[][]=new int[students][3];

		//create arrays for percentage and grade
		double percentage[]=new double[students];
		char grade[]=new char[students];

		//take input marks
		for(int i=0;i<students;i++)
		{
			System.out.println("Enter marks of student "+(i+1));

			System.out.print("Physics: ");
			marks[i][0]=input.nextInt();

			System.out.print("Chemistry: ");
			marks[i][1]=input.nextInt();

			System.out.print("Maths: ");
			marks[i][2]=input.nextInt();
		}

		//calculate percentage and grade
		for(int i=0;i<students;i++)
		{
			int total=marks[i][0]+marks[i][1]+marks[i][2];
			percentage[i]=total/3.0;

			if(percentage[i]>=75)
			{
				grade[i]='A';
			}
			else if(percentage[i]>=60)
			{
				grade[i]='B';
			}
			else if(percentage[i]>=50)
			{
				grade[i]='C';
			}
			else
			{
				grade[i]='D';
			}
		}

		//display result
		for(int i=0;i<students;i++)
		{
			System.out.println("Student "+(i+1)+" Percentage: "+percentage[i]);
			System.out.println("Student "+(i+1)+" Grade: "+grade[i]);
		}

		input.close();  //closing input stream
	}
}
