package com.string;

import java.util.Scanner;

public class CapitalizeLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        String capitalizeString=changeToUpper(str);
        System.out.println(capitalizeString);
    }
    public static String changeToUpper(String s){
        char[] k=s.toCharArray();
        boolean isTrue=false;
        k[0]=Character.toUpperCase(k[0]);
        for(int i=1;i<k.length;i++){
            if(Character.isWhitespace(k[i])){
                isTrue=true;
            }
            else if(isTrue){
                k[i]=Character.toUpperCase(k[i]);
                isTrue=false;
            }
        }
        return new String(k);
    }
}
