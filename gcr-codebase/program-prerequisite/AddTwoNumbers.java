import java.util.Scanner;

public class AddTwoNumbers{
    public static double addTwoNumbers(double num1,double num2){
        return num1 + num2;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1=sc.nextDouble();
        System.out.print("Enter second number : ");
        double num2=sc.nextDouble();
        double sum=addTwoNumbers(num1,num2);
        System.out.println("Sum : "+sum);
    }
}
