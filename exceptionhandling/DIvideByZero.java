package exceptionhandling;

public class DIvideByZero {
    public static void main(String[] args) {
        try {
            System.out.println(5/0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
