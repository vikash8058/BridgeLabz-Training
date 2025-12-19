//program to change a multidimensional 2-D arrays into a single dimension arrays

import java.util.Scanner;

public class Change2DArrayInto1DArray
{
	public static void main(String[] args)
	{
		//create a Scanner object
		Scanner input=new Scanner(System.in);
		
		//get input values
		System.out.print("Enter the length of rows: ");
		int rows=input.nextInt();
		System.out.print("Enter the length of column: ");
		int column=input.nextInt();
		
		//creating 2d array and taking input into it
		int array_2d[][]=new int[rows][column];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				array_2d[i][j]=input.nextInt();
			}
		}
		
		//creating a single array of size row*column and copy the elements of 2d array into 1d array
		int array_1d[]=new int[rows*column];
		int index=0;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				array_1d[index++]=array_2d[i][j];
			}
		}
		
		//displaying 1-d Array
		System.out.println("one dimensional array : ");
		for(int i=0;i<index;i++)
		{
			System.out.print(array_1d[i]+" ");
		}
		
		input.close(); //closing input stream
	}
}