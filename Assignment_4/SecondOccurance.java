import java.util.Scanner;

public class SecondOccurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0,index=-1;
        System.out.println("Enter the array length: ");
        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the find number: ");
        int n=sc.nextInt();
        for(int i=0;i<len;i++){
            if(arr[i]==n){
                count++;
                if(count==2)
                {
                    index=i;
                }
            }
        }
        if(count>2)
        {
            System.out.println("-1");
        }
        else
         System.out.println(index);
    }
}
