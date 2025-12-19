//program to find youngest and tallest friend using arrays
import java.util.Scanner;

public class YoungestTallestArray
{
	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//create arrays
		int age[]=new int[3];
		int height[]=new int[3];

		//take input
		for(int i=0;i<3;i++)
		{
			System.out.print("Enter age of friend "+(i+1)+": ");
			age[i]=input.nextInt();

			System.out.print("Enter height of friend "+(i+1)+": ");
			height[i]=input.nextInt();
		}

		//initialize values
		int youngestAge=age[0];
		int tallestHeight=height[0];

		//find youngest and tallest
		for(int i=1;i<3;i++)
		{
			if(age[i]<youngestAge)
			{
				youngestAge=age[i];
			}

			if(height[i]>tallestHeight)
			{
				tallestHeight=height[i];
			}
		}

		//display result
		System.out.println("Youngest Age: "+youngestAge);
		System.out.println("Tallest Height: "+tallestHeight);

		input.close();  //closing input stream
	}
}
