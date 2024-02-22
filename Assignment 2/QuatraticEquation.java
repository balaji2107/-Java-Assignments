import java.util.Scanner;

public class QuatraticEquation {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a value: ");
        int a=sc.nextInt();
        System.out.println("Enter the b value: ");
        int b=sc.nextInt();
        System.out.println("Enter the c value: ");
        int c=sc.nextInt();
        double r1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        double r2=(-b-Math.sqrt(b*b-4*a*c))/2*a;

        System.out.print("root1: " +(int)r1+ "root2: " +(int)r2);
    }
}
