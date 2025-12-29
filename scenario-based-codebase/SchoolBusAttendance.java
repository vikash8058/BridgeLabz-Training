/*
9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.Scanner;

public class SchoolBusAttendance{
	public static void main(String[] args){
		
		//creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//create an array of 10 students 
		String[] names={
			"Vishal","Vikash","Sakshi","Anuj","Anupam",
			"Utkarsh","Virendra","Kundu","Shubham","Sahil"
		};
		
		int presentCount=0, absentCount=0;  
		
		for(String student:names){
			System.out.print(student+": present/absent - ");
			String status=input.next();
			
			if(status.equalsIgnoreCase("Present")){
				presentCount++;
			}
			else{
				absentCount++;
			}
		}
		System.out.println();
		
		System.out.println("\\\tAttendance Summary\\\t");
		System.out.println("Total number of present student is: "+presentCount);  //display number of present student
		System.out.println("Total number of absent student is: "+absentCount);    //display number of absent student
		
		input.close();  //closing input stream
	}
}