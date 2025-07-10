abstract class Vehicle{
    public abstract void startengine();
    public abstract void stopengine();
}
class Car extends Vehicle{
    Car(){

    }
    public void startengine(){
        System.out.println("Car has been started");
    }
    public void stopengine(){
        System.out.println("Car is stopped.");
    }
}

class MotorBike extends Vehicle{
    MotorBike(){

    }
   public void startengine(){
        System.out.println("MotorBike has been started");
    }
    public void stopengine(){
        System.out.println("MotorBike is stopped.");
    }
}
public class Machinery {
    public static void main(String[] args) {
        Vehicle[] v1 = new Vehicle[2];
        v1[0] = new Car();
        v1[0].startengine();
        v1[0].stopengine();
        System.out.println("----New Vehicle Details----");
        v1[1] = new MotorBike();
        v1[1].startengine();
//        v1[1].stopengine();
        v1[1].startengine();
    }
}