public class FindClass {
    public static void main(String[] a){
        SecondClass obj=new SecondClass();
        obj.childMethod();
        obj.parentMethod();
    }
}
class FirstClass{
    void parentMethod(){
        System.out.println("parent class");
    }

}
class SecondClass extends FirstClass{
    void childMethod(){
        System.out.println("sub class");
    }
}
