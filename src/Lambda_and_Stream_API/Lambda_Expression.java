package Lambda_and_Stream_API;



// A lambda expression in Java is a shorthand way to represent an anonymous function (i.e., a method without a name) that can be passed around as data. 
// Lambda expressions were introduced in Java 8 and are 
// primarily used to implement functional interfaces (interfaces with a single abstract method).
public class Lambda_Expression {
    public static void main(String[] args) {

        // Older Way of dealing with functional interfaces.
        // Walkable obj = new WalkFast();
        // obj.walk(8, false);


        // Walkable obj = new Walkable() {

        //     @Override
        //     public int walk(int steps, boolean isEnabled) {
        //         return 0;
        //     }
        // };


        //LAMBDA EXPRESSION TO DEAL WITH FUNCTIONAL INTERFACES
        Walkable obj = (steps, isEnabled) -> {
            System.out.println("Walking fast: " +steps + " steps.");
            return 2*steps;
        };
        // SINGLE LINE DEFINITION OF LAMBDA EXPRESSION
        // Walkable obj2 = (steps, isEnabled) -> 2*steps;

        obj.walk(4,true);
    }
}

// @FunctionalInterface :-- interface containing one method is termed as Functional Interface
interface Walkable{
    int walk(int steps, boolean isEnabled);
}


// class WalkFast implements Walkable{
//     @Override
//     public int walk(int steps, boolean isEnabled) {
//         System.out.println("Walking fast: " +steps + " steps.");
//         return 2*steps;
//     }
// }



