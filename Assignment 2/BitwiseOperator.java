import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b=sc.nextInt();

        System.out.println("Bitwise AND operator: " + (a&b));
        System.out.println("Bitwise OR operator: " + (a|b));
        System.out.println("Bitwise Complement operator: " + (~a));
        System.out.println("Bitwise XOR operator: " + (a^b));
        System.out.println("Bitwise left shift operator: " + (a<<1));
        System.out.println("Bitwise right shift operator: " + (a>>2));
        

    }
}
