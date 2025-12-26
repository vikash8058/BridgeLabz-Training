//program to generate student result and grade
import java.util.Scanner;

public class ResultGenerator
{
	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		int marks[]=new int[5];
		int total=0;

		//take marks input
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter marks for subject "+(i+1)+": ");
			marks[i]=input.nextInt();
			total=total+marks[i];
		}

		//calculate average
		int average=total/5;

		//display average
		System.out.println("Average Marks: "+average);

		//assign grade using switch
		switch(average/10)
		{
			case 10:
			case 9:
				System.out.println("Grade: A");
				break;

			case 8:
				System.out.println("Grade: B");
				break;

			case 7:
				System.out.println("Grade: C");
				break;

			case 6:
				System.out.println("Grade: D");
				break;

			default:
				System.out.println("Grade: F");
		}

		input.close(); //closing input stream
	}
}
