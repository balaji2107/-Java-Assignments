package assignment;

class Shape {
    double base;
    double height;
    Shape(double base,double height){
	this.base=base;
	this.height=height;
    }
   
}

class Rectangle extends Shape {

    public Rectangle(double base, double height) {

        super(base, height);

    }

    public void areaOfRectangle() {
       double a = base * height;
       System.out.println("Area of Rectangle: " +a);
    }
}

class Triangle extends Shape {

    public Triangle(double base, double height) {
        super(base, height);
    }

    public void areaOfTriangle() {
        double a = 0.5 * base * height;
	System.out.println("Area of Triangle: "+a);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(30, 40);
        r.areaOfRectangle();
        Triangle t = new Triangle(30, 40);
        t.areaOfTriangle();
    }

}