package Dlambda.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PipelineExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("michael", "don", "sushi", "leg", "a", "bb");
        Optional<String> shortestName = names.stream()
                // to upper case
                .map(String::toUpperCase)
                // accept yang length nya 3
                .filter(value -> value.length() <= 3)
                // sort
                .sorted(Comparator.comparingInt(String::length))
                // ambil yang pertama
                .findFirst();
        shortestName.ifPresent(System.out::println);
    }
}
