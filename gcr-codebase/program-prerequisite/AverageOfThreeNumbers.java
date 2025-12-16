import java.util.Scanner;

public class AverageOfThreeNumbers{
    public static double calculateAverage(double num1,double num2,double num3){
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1=sc.nextDouble();
        System.out.print("Enter second number : ");
        double num2=sc.nextDouble();
        System.out.print("Enter third number : ");
        double num3=sc.nextDouble();
        double average=calculateAverage(num1,num2,num3);
        System.out.println("Average : "+average);
    }
}
