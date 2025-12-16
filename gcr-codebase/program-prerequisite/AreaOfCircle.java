import java.util.Scanner;

public class AreaOfCircle{
    public static double areaOfCircle(double radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double radius=sc.nextDouble();
        double area=areaOfCircle(radius);
        System.out.println("Area of the Circle : "+area);
    }
}
