import java.util.Scanner;

public class SimpleInterest{
    public static double calculateSimpleInterest(double principal,double rate,double time){
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal : ");
        double principal=sc.nextDouble();
        System.out.print("Enter the rate : ");
        double rate=sc.nextDouble();
        System.out.print("Enter the time : ");
        double time=sc.nextDouble();
        double interest=calculateSimpleInterest(principal,rate,time);
        System.out.println("Simple Interest : "+interest);
    }
}
