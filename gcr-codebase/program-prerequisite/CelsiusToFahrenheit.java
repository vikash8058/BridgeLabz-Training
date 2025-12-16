import java.util.Scanner;

public class CelsiusToFahrenheit{
    public static double convertCelsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature in Celsius : ");
        double celsius=sc.nextDouble();
        double fahrenheit=convertCelsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit : "+fahrenheit);
    }
}
