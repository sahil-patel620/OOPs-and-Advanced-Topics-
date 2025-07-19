package OOPs.Inheritance;

public class Vehicle {

    String model;
    int noOfWheels;

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
}
