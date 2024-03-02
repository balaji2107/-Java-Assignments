package com.string;

import java.util.Scanner;

public class ReverseCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        char[] charArr=str.toCharArray();
        int left=0,right=charArr.length-1;
        while (left<right){
            char temp=charArr[left];
            charArr[left]=charArr[right];
            charArr[right]=temp;
            left++;
            right--;
        }
        for(char val:charArr){
            System.out.print(val);
        }
    }
}
