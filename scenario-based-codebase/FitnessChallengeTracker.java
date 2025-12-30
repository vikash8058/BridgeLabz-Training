/*
13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/

import java.util.Scanner;

public class FitnessChallengeTracker{
	public static void main(String[] args){
		
		//creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//creating an array of 7 length (7 days in a week)to store each day's pushups count 
		int[] pushups=new int[7];
		
		System.out.println("Enter the number of pushups of each day");
		//getting the number of pushups from user
		for(int i=0;i<7;i++){
			System.out.print("Sandeep's day "+(i+1)+" push-ups count: ");
			pushups[i]=input.nextInt();
			if(pushups[i]==0){
				System.out.println("Day "+(i+1)+" is rest day");
			}
		}
		System.out.println();
		
		int totalPushups=0;  //initialize the number of total pushups as 0
		
		//count the total number of pushups in a week
		for(int countPushups : pushups){
			if(countPushups==0){
				continue;
			}
			else{
				totalPushups+=countPushups;
			}
		}
		
		//displaying the result
		System.out.println("Sandeep's total number of push-ups in a week is: "+totalPushups);
		System.out.println("Sandeep's average push-ups in a week is: "+totalPushups/7);
		
		input.close(); //closing the input stream
	}
}