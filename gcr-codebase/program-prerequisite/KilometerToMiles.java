import java.util.Scanner;

public class KilometerToMiles{
    public static double convertKilometerToMiles(double kilometers){
        return kilometers * 0.621371;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter distance in kilometers : ");
        double kilometers=sc.nextDouble();
        double miles=convertKilometerToMiles(kilometers);
        System.out.println("Distance in Miles : "+miles);
    }
}
