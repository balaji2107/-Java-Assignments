package methodoverloadAndmethodOverride;

public class MathOperation {
    public double add(int a,double b){
        return a+b;
    }
    public double add(double a,int b){
        return a+b;
    }

    public float subtract(float a, int b) {
        return a - b;
    }

    public double subtract(double a, int b) {
        return a - b;
    }
    public long multiply(int a, long b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public  int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public  double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }




}
