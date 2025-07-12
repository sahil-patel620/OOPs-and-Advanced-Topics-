package OOPs.Inheritance;

public class Car extends Vehicle{

    // method is overridden
    void start(){
        System.out.println("Car is starting");
    }
    public static void main(String[] args) {
        Car maruti = new Car();
        maruti.model = "I10";
        maruti.noOfWheels = 4;
        maruti.start();
        System.out.println("Car Model is : "+ maruti.model);
        System.out.println("Car have "+ maruti.noOfWheels + " wheel");
    }
}
