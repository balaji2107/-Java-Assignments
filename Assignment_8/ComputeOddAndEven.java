package Assignment;

import java.util.Scanner;

public class ComputeOddAndEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.print(n+" ");
        while(n!=1) {
            n = n % 2 == 0 ?(n/2):(3*n)+1;
            System.out.print(n+" ");
        }
    }
}
