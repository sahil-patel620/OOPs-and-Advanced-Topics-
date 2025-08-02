package Lambda_and_Stream_API.Stream_API;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class StreamClass {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Mango", "Banana", "Kiwi", "Grapes");

        // First way
        Stream<String> stream = fruits.stream();
        stream.filter(fruit -> fruit.length() < 6)
                .sorted()
                // .map(fruit -> fruit.length())
                // .map(fruitLength -> 2 * fruitLength)
                // .forEach(fruit -> System.out.println(fruit)); //Lambda version

                // A method reference is a shorthand syntax for calling a method using a lambda expression,
                // when the lambda just calls a method and does nothing else.
                .forEach(System.out::println);

        // Another Way
        List<Integer> fruitsList = fruits.stream()
                .map(fruit -> fruit.length())
                .collect(Collectors.toList());
        System.out.println(fruitsList);

        Map<String, Integer> fruitsMap = fruits.stream()
                .collect(Collectors.toMap(fruit -> fruit,
                        fruit -> fruit.length()));
        System.out.println(fruitsMap);
    }

}
