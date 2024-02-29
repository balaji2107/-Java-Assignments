import java.util.*;
public class RotateArray {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        System.out.print("Enter the number position: ");
        int pos=sc.nextInt();
        for(int i=0;i<pos;i++){
            int temp=arr[arr.length-1];
            for(int j=arr.length-1;j>=1;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
