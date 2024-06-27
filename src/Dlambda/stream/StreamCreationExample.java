package Dlambda.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamCreationExample {
    public static void main(String[] args) {
        // data / byte
        // Basic Stream Init
        Stream<String> value = Stream.of("michael", "raphael", "don", "leo");
        String canBeNull = null;
        Stream<String> isNull = Stream.ofNullable(canBeNull);

        // From Array
        String[] array = {"michael", "don", "raphael", "leo"};
        Stream<String> streamKura2 = Arrays.stream(array);
//        Predicate<String>

        //FROM COLLECTIONS
        List<String> names = Arrays.asList("michael", "don", "raphael", "leo");
        Stream<String> listToString = names.stream();

        // HASH SET
        Set<String> fruits = new HashSet<>();
        fruits.add("pisang");
        fruits.add("apel");
        Stream<String> fruitsStream = fruits.stream();
        fruitsStream.forEach(fruit -> System.out.println(fruit));


    }
}
