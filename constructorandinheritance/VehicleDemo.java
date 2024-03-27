package assignment;

class Vehicle{
    int speed;
    Vehicle(int speed){
	this.speed=speed;
     }
}
class Bus extends Vehicle{
    Bus(int speed){
        super(speed);
    }
    void moveBus(){
        System.out.println("Bus moving speed is: "+speed);
    }

}
class Train extends Vehicle{
    
    Train(int speed){
        super(speed);
    }
    void moveTrain(){
        System.out.println("Train moving speed is: "+speed);
    }

}

public class VehicleDemo {
    public static void main(String[] args) {
        Bus bus=new Bus(10);
        bus.moveBus();
  
        Train train=new Train(20);
        train.moveTrain();
    }
}
