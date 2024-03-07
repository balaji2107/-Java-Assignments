package assignmentone;

import javax.sound.sampled.Port;

public class Product {
    byte a;
    short b;
    char c;
    int d;
    float e;
    long f;
    double g;
    boolean h;

}
class ChildClass{
    public static void main(String[] args) {
        Product obj=new Product();
        System.out.println("Byte Value: " +obj.a);
        System.out.println("short Value: " +obj.b);
        System.out.println("char Value: " +obj.c);
        System.out.println("int Value: " +obj.d);
        System.out.println("float Value: " +obj.e);
        System.out.println("long Value: " +obj.f);
        System.out.println("double Value: " +obj.g);
        System.out.println("boolean Value: " +obj.h);

    }
}