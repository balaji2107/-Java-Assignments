import java.util.Scanner;

public class BodyMass {
    public static void main(String[] arg){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your weight in kilograms: ");
            double weight = sc.nextDouble();
            System.out.print("Enter your height in meters: ");
            double height = sc.nextDouble();
            double calculateBMI= weight / (height * height);
            System.out.println("BMI is: " +calculateBMI);

            if (calculateBMI < 18.5) {
                System.out.print("Underweight");
            }
            else if (calculateBMI < 25) {
                System.out.print("Normal");
            }
            else if (calculateBMI < 30) {
                System.out.print("Overweight");
            }
            else {
                System.out.print( "Obese");
            }
    }
}
