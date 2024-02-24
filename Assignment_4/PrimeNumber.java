import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting and ending number: ");
        int st=sc.nextInt();
        int end=sc.nextInt();
        System.out.println("Prime Number is: ");
        for(int i=st;i<end;i++){
            if(findPrimeOrNot(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean findPrimeOrNot(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}