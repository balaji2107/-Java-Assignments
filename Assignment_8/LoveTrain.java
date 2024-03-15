package Assignment;

import java.util.Scanner;

public class LoveTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word with an odd number of letters: ");
        String word = scanner.nextLine();

        if (word.length() % 2 == 0) {
            System.out.println("Please enter a word with an odd number of letters.");
            return;
        }
        String res="";

        int middleIndex = word.length() / 2;
        int repetition = middleIndex+1;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            res+=String.valueOf(currentChar).repeat(repetition);
            if (i <= middleIndex) {
                repetition--;
            } else {
                repetition++;
            }
        }
        System.out.println("Result: " + res);
    }
}
