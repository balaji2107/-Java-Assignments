package Assignment;

import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        int res=findSquare(value);
        System.out.println(res);
    }
    static int findSquare(int d){
        int a=1;

        while(d>a*a) {
            a++;
        }
        if(d==(a*a)){
            return a;
        }
        int finddiff=Math.abs(((a-1)*(a-1))-d);
        int findDiff=Math.abs((a*a)-d);
        if(finddiff>findDiff){
            return a;
        }
        return a-1;
    }
}
