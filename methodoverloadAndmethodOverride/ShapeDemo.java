package methodoverloadAndmethodOverride;

abstract class Shape{
    abstract public double area();
    abstract public double perimeter();

}
class Rectangle extends Shape{
    double lenght;
    double width;
    Rectangle(double lenght,double width){
        this.lenght=lenght;
        this.width=width;
    }
    @Override
    public double area() {
        return lenght*width;
    }
    @Override
    public double perimeter() {
        return 2*(lenght+width);
    }

}
class Square extends Shape{
    int a;
    Square(int a){
        this.a=a;
    }
    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return 4*a;
    }
}
class ShowALl{
    public void show(Shape shape){
        System.out.println(shape.area());
        System.out.println(shape.perimeter());
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Shape r=new Rectangle(30,40);
        Shape t=new Square(10);
        ShowALl printALl=new ShowALl();
        printALl.show(r);
        printALl.show(t);
    }
}
