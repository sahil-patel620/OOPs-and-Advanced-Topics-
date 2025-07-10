package OOPs.Inheritance;

public class Car extends Vehicle{
    public static void main(String[] args) {
        Car maruti = new Car();
        maruti.model = "I10";
        maruti.noOfWheels = 4;
        maruti.start();   // method inherited from Vehicle
        System.out.println("Car Model is : "+ maruti.model);
        System.out.println("Car have "+ maruti.noOfWheels + " wheels");
    }
}
