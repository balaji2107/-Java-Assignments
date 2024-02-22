import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the Celsius: ");
        double inputCelsius=sc.nextDouble();
        double fahrenheit=(inputCelsius*9/5)+32;
        System.out.println(fahrenheit);
    }
}