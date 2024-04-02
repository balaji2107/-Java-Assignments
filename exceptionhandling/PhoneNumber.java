package exceptionhandling;
import java.util.*;
public class PhoneNumber {
    static void inputNumber(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your phone number: ");
            long phoneNumber = scanner.nextLong();
            System.out.println("Phone number entered: " + phoneNumber);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter only numbers.");
            inputNumber();
        }
    }
    public static void main(String[] args) {
       inputNumber();
    }
}
