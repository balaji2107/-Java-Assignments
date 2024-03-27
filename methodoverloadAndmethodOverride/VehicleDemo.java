package methodoverloadAndmethodOverride;

class Vehicle{
    public void start(){
        System.out.println("Vehicle Moving....");
    }
    public void stop(){
        System.out.println("Vehicle Stop.....");
    }
}
class Bus extends Vehicle{
    public void start(){
        System.out.println("Bus moving....");
    }
    public void stop(){
        System.out.println("Bus stop....");
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle b=new Bus();
        b.start();
        b.stop();
    }
}
