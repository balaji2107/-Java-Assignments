package exceptionhandling;

public class ArrayIndexException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            int value = numbers[10];
            System.out.println("Value at index 10: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
