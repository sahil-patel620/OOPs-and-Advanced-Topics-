package OOPs.Inheritance;

public class Car extends Vehicle{

    // method is overridden
    void start(){
        Scooter scooterObj = new Scooter();
        scooterObj.braking(this);
        super.start();
        System.out.println(this);
        System.out.println(this.model +" Car is starting");
    }

    Car(){
        super(3);
        System.out.println("Car is being created");
    }

    Car braking(){
        return this;
    }

    public static void main(String[] args) {
        Car maruti = new Car();
//        maruti.model = "I10";
        System.out.println("Car have: "+ maruti.noOfWheels + " wheel");
        maruti.noOfWheels = 4;
        maruti.start();
        System.out.println("Car Model is : "+ maruti.model);
        System.out.println("Car have: "+ maruti.noOfWheels + " wheel");

        maruti.accelerate();
    }
}

class Scooter{
    void braking(Car car){
        System.out.println(car.model + " is braking.");
    }
}

final class bicycle{
    void cycling(){
        System.out.println("Cycling");
    }
}