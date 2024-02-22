import java.util.Scanner;

public class TimeCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Second: ");
        int sec=sc.nextInt();

        int hr=sec/3600;
        int rem=sec%3600;
        int min=rem/60;
        int se=rem%60;
        System.out.println("HH:MM:SS:"+hr+":"+min+":"+se);

    }
}
