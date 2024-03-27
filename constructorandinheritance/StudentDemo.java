package assignment;

class Student{
    String name;
    int age;
    String gender;
    Student(String name,int age){
        this(name);
        this.age=age;
    }
    Student(String name){
        this.name=name;
    }

}
class ZSGSStudent extends Student{
    ZSGSStudent(String name,int age,String gender){
        super(name,age);
        this.gender=gender;
    }

}

public class StudentDemo {
    public static void main(String[] args) {
//        Student s=new ZSGSStudent("ram",21);  //Show Error
        ZSGSStudent zsgs=new ZSGSStudent("Balaji",21,"male");
    }
}
