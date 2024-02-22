import java.util.Scanner;
public class FindNoOfDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month: ");
        String month=sc.nextLine().toLowerCase();
        System.out.println("Enter the Year: ");
        int year=sc.nextInt();
        switch (month) {
            case "january":
                System.out.println("Total No of Days in Month: 31 ");
                break;
            case "february":
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                  System.out.println("Total No of Days in Month: 29");
                } 
                else{
                    System.out.println("Total No of Days in Month: 28");
                }
                break;
            case "march":
                System.out.println("Total No of Days in Month: 31");
                break;
            case "april":
                System.out.println("Total No of Days in Month: 30");
                break;
            case "may":
                System.out.println("Total No of Days in Month: 31");
                break;
            case "june":
                System.out.println("Total No of Days in Month: 30");
                break;
            case "july":
                System.out.println("Total No of Days in Month: 31");
                break;
            case "august":
                System.out.println("Total No of Days in Month: 31");
                break;
            case "september":
                System.out.println("Total No of Days in Month: 30");
                break;
            case "october":
                System.out.println("Total No of Days in Month: 31");
                break;
            case "november":
                System.out.println("Total No of Days in Month: 30");
                break;
            case "december":
                System.out.println("Total No of Days in Month: 31");
                break;
            default:
                System.out.println("Please Enter valid Input");
                break;
        }
    }
}
