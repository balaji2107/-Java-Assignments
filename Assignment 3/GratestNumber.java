import java.util.Scanner;

public class GratestNumber{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int findGreat=greatest(num1,num2,num3);
        System.out.println(findGreat);
    }
    public static int greatest(int a,int b,int c){
        return (a>b)&&(a>c)?a:(b>c)&&(b>a)?b:c;
    }
}