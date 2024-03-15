package Assignment;

import java.util.Scanner;

public class CharExistOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        System.out.println("Enter the find character: ");
        char c=sc.next().charAt(0);
        boolean res=findChar(s,c);
        System.out.println(res);
    }
    static boolean findChar(String str,char c){
        if(str.length()==0)
            return false;
        if(str.charAt(0)==c)
            return true;
        return findChar(str.substring(1),c);
    }
}
