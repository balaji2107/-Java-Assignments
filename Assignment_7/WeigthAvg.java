package assignmentone;

import java.util.Scanner;

public class WeigthAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many people find average: ");
        int peopleCount=sc.nextInt();
        double sum=0;
        System.out.println("Enter people weight: ");
        for(int i=0;i<peopleCount;i++){
            sum+=sc.nextDouble();
        }
        double weightAverage=sum/peopleCount;
        System.out.printf("People weight average: %.2f", weightAverage);
    }
}
