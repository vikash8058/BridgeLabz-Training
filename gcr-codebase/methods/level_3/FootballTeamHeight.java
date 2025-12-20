//program to find shortest, tallest and mean height of football players
public class FootballTeamHeight
{
	//method to find sum of heights
	public static int findSum(int heights[])
	{
		int sum=0;
		for(int i=0;i<heights.length;i++)
		{
			sum=sum+heights[i];
		}
		return sum;
	}

	//method to find mean height
	public static double findMean(int heights[])
	{
		return findSum(heights)/(double)heights.length;
	}

	//method to find shortest height
	public static int findShortest(int heights[])
	{
		int min=heights[0];
		for(int i=1;i<heights.length;i++)
		{
			if(heights[i]<min)
			{
				min=heights[i];
			}
		}
		return min;
	}

	//method to find tallest height
	public static int findTallest(int heights[])
	{
		int max=heights[0];
		for(int i=1;i<heights.length;i++)
		{
			if(heights[i]>max)
			{
				max=heights[i];
			}
		}
		return max;
	}

	public static void main(String[] args)
	{
		int heights[]=new int[11];

		//generate random heights between 150 and 250
		for(int i=0;i<heights.length;i++)
		{
			heights[i]=(int)(Math.random()*101)+150;
		}

		//display results
		System.out.println("Shortest Height: "+findShortest(heights));
		System.out.println("Tallest Height: "+findTallest(heights));
		System.out.println("Mean Height: "+findMean(heights));
	}
}
