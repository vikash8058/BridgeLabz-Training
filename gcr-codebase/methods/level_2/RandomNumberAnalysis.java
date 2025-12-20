//program to generate 4 digit random numbers and find average, min and max
public class RandomNumberAnalysis
{
	//method to generate array of 4 digit random numbers
	public int[] generate4DigitRandomArray(int size)
	{
		//create array of given size
		int numbers[]=new int[size];

		//generate random 4 digit numbers
		for(int i=0;i<size;i++)
		{
			numbers[i]=(int)(Math.random()*9000)+1000;
		}

		return numbers;
	}

	//method to find average, minimum and maximum value
	public double[] findAverageMinMax(int numbers[])
	{
		double result[]=new double[3];

		int min=numbers[0];
		int max=numbers[0];
		int sum=0;

		//find sum, min and max
		for(int i=0;i<numbers.length;i++)
		{
			sum=sum+numbers[i];
			min=Math.min(min,numbers[i]);
			max=Math.max(max,numbers[i]);
		}

		//store results
		result[0]=sum/(double)numbers.length; //average
		result[1]=min;                         //minimum
		result[2]=max;                         //maximum

		return result;
	}

	public static void main(String[] args)
	{
		//create object of the class
		RandomNumberAnalysis randomObj=new RandomNumberAnalysis();

		//generate array of 5 random numbers
		int numbers[]=randomObj.generate4DigitRandomArray(5);

		//display generated numbers
		System.out.print("Generated numbers: ");
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i]+" ");
		}

		//find average, min and max
		double result[]=randomObj.findAverageMinMax(numbers);

		//display result
		System.out.println("\nAverage value: "+result[0]);
		System.out.println("Minimum value: "+result[1]);
		System.out.println("Maximum value: "+result[2]);
	}
}
