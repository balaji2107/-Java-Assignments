import java.util.Scanner;

public class ScoreGrade {
    public static char calculateGrade(double score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score < 90) {
            return 'B';
        } else if (score >= 70 && score < 80) {
            return 'C';
        } else if (score >= 60 && score < 70) {
            return 'D';
        } else if (score >= 0 && score < 60) {
            return 'F';
        } else {
            return 'I'; 
        }
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Student Score: ");
        double score=sc.nextDouble();
        char grade = calculateGrade(score);
        if(grade=='I'){
            System.out.print("Please Enter Valid input");
        }
        else{
        System.out.println("The student's grade is: " + grade);
        }
    }
}
