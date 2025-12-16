import java.util.Scanner;

public class PerimeterOfRectangle{
    public static double perimeterOfRectangle(double length,double width){
        return 2 * (length + width);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length : ");
        double length=sc.nextDouble();
        System.out.print("Enter the width : ");
        double width=sc.nextDouble();
        double perimeter=perimeterOfRectangle(length,width);
        System.out.println("Perimeter of the Rectangle : "+perimeter);
    }
}
