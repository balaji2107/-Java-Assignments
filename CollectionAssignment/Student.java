import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Student {
    int rollNo;
    String studentName;
    Date date_of_birth;
    public Student(int rollNo, String studentName, Date date_of_birth) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.date_of_birth = date_of_birth;
    }
}
class RollNoSort implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int roll=o1.rollNo;
        int roll2=o2.rollNo;

        if(roll==roll2){
            return 0;
        }
        else if(roll>roll2){
            return 1;
        }
        else
            return -1;
    }
}
class NameSort implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        String name1=o1.studentName;
        String  name2=o2.studentName;
        return name1.compareTo(name2);
    }
}
class DateSort implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        Date date1=o1.date_of_birth;
        Date  date2=o2.date_of_birth;
        return date1.compareTo(date2);
    }
}
class StudentDemo{

    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> stuList=new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        stuList.add(new Student(2,"balaji",sdf.parse("2002-03-15")));
        stuList.add(new Student(4,"ram",sdf.parse("2003-04-15")));
        stuList.add(new Student(1,"arumugam",sdf.parse("2000-01-15")));

        System.out.println("----Before Sorting--------");

        for(Student list:stuList){
            System.out.println("Student ROllNo: " + list.rollNo);
            System.out.println("Student Name: " +list.studentName);
            System.out.println("Student DOB: " +list.date_of_birth);
        }
        System.out.println("----------------------------------------\n\n");

        System.out.println("Enter the choice which column can be sort");
        System.out.println("1. RollNo\n2. Student Name\n3. DOB");
        String choice=sc.nextLine();
        switch (choice){
            case "1":
                Collections.sort(stuList,new RollNoSort());
                showDetails(stuList);
                break;
            case "2":
                Collections.sort(stuList,new NameSort());
                showDetails(stuList);
                break;
            case "3":
                Collections.sort(stuList,new DateSort());
                showDetails(stuList);
                break;
            default:
                System.out.println("Please Enter Valid Input");

        }
    }

    private static void showDetails(ArrayList<Student> stuList) {
        System.out.println("\n\n----After Sorting--------\n");

        for(Student list:stuList){
            System.out.println("Student ROllNo: " + list.rollNo);
            System.out.println("Student Name: " +list.studentName);
            System.out.println("Student DOB: " +list.date_of_birth);
        }
        System.out.print("----------------------------------------");

    }
}


