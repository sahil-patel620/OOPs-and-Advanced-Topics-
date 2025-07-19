package OOPs.Inheritance;

public class Vehicle {

    String model;
    int noOfWheels;
    final int gears = 4;  // it is important o initialize final variable

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2);
//        v1.gears = 8;  // cannot change final variable value
    }

    Vehicle(){
        System.out.println("Creating a vehicle instance");
    }

    Vehicle(int noOfWheels){
        this.noOfWheels = noOfWheels;
        System.out.println("Creating vehicle with wheels");
    }
    void start(){
        System.out.println("Vehicle is starting");
    }

    //final method cannot be overridden by child classes.
    final void accelerate(){
        System.out.println("Vehicle is accelerating.");
    }
}
