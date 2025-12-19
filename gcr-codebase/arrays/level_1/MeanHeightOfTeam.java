//program to find the mean height of players present in a football team
import java.util.Scanner;
public class MeanHeightOfTeam {
    public static void main(String[]args){
            //create array for team
           double[]team=new double[11];
  
           // create Scanner class 
             Scanner input =new Scanner(System.in);
           
           //take input in team array
           System.out.println("Enter height of player:");
             
             for(int i=0;i<11;i++){
              
                  team[i]=input.nextDouble();
               }
         
           //find sum of height of all player
              double sumOfHeight=0.0;
             for(int i=0;i<11;i++){
               sumOfHeight+=team[i];
              }
            
          //find the mean of team;
          double meanHeightOfTeam=sumOfHeight/11;
          
         //display the result
           System.out.println("Mean Height of team: "+meanHeightOfTeam);

           
        //close the scanner
          input.close();
         
   }

}