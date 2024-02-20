import java.util.Scanner;
public class GetWeekday {
    enum Weekday {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
   public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number get weekdays: ");
    int userInput=sc.nextInt();

    if(userInput>=1 && userInput<=Weekday.values().length){
        Weekday selectedDay=Weekday.values()[userInput-1];
        System.out.println("The weekday is: " + selectedDay);
    } else {
        System.out.println("Invalid input");
    }
    
   }
}
