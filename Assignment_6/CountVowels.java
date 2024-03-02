package com.string;


import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){

            if(isVowel(Character.toLowerCase(str.charAt(i)))){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isVowel(char k){
        if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u'){
            return true;
        }
        return false;
    }
}
