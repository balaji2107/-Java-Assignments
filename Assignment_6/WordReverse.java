package com.string;

import java.util.Scanner;

public class WordReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        String res="";
        String[] spStr=str.split(" ");
        for(int i= spStr.length-1;i>=0;i--){
            res+=spStr[i]+" ";
        }
        System.out.print(res);
    }
}
