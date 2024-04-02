package exceptionhandling;
class AgeVerification extends Exception {
    public AgeVerification(String message) {
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new AgeVerification("Age must be 18 or above to proceed.");
            } else {
                System.out.println("Welcome! Age verification successful.");
            }
        } catch (AgeVerification e) {
            System.out.println(e.getMessage());
        }
    }
}
