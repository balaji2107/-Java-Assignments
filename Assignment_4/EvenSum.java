import java.util.Scanner;

public class EvenSum{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of length: ");
        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<len;i++){
            if(arr[i]%2 != 0){
                continue;
            }
            sum+=arr[i];
        }
        System.out.print("Sum is: " +sum);
    }
}