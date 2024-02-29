// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;
// import java.util.Scanner;
import java.util.*;
public class MinimumWeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Persion: ");
        int noOfPersion=sc.nextInt();
        List<Integer>[] k=new List[noOfPersion];
        while (true) {
            System.out.println("Enter Your choice: ");
            System.out.println("1.Adding no of persion");
            System.out.println("2.Find nth Persion Minimum");
            System.out.println("3.Exit");
            int val=sc.nextInt();
            switch (val) {
                case 1:
                    
                    int count=0;
                   
                    for(int i=0;i<noOfPersion;i++){
                        k[i]=new ArrayList<Integer>();
                    }
                    if(count<noOfPersion)  {
                    System.out.println("Enter the persion no: ");
                    int persionNo=sc.nextInt(); 
                    System.out.println("Enter the no  weight: ");
                    int noOfWeight=sc.nextInt();
                    System.out.println("Enter the weights: ");
                    for(int i=0;i<noOfWeight;i++){
                         k[count].add(sc.nextInt());   
                    }
                    count++;
                    }
                    else{
                        System.out.println("Only"+noOfPersion
                        +"add");
                    }
                    
                    break;
                case 2:
                    if(k.length!=0){
                        System.out.println("Enter the which persion find  minimum weight: ");
                        int index=sc.nextInt();
                        int min=Collections.min(k[index-1]);
                        System.out.println(min);
                    }   
                    else{
                         System.out.println("No person added");
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
