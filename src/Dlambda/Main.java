package Dlambda;

import Dlambda.lambda.DoSomething;
import Dlambda.method_reference.StringUtil;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(array);
        DoSomething something = new DoSomething() {
            @Override
            public int action(int num) {
                return num + 1;
            }
        };
        DoSomething something2 = num -> num + 1;
        list.forEach(x -> {
            System.out.println("from something: " + something.action(x));
            System.out.println("from something2: " + something2.action(x));
        });

        // java.util.function
        Consumer<String> consumer = value -> System.out.println(value);
        consumer.accept("ackerman");

        // Function
        Function<String, Integer> function = x -> x.length();
        System.out.println(function.apply("levi"));

        // Predicate
        Predicate<String> predicate = value -> value.isBlank();
        System.out.println(predicate.test(""));

        // method reference
        Predicate<String> predicateMethodReference = StringUtil::isLowerCase;
        System.out.println(predicateMethodReference.test("EEE"));

        // Predicate untuk check something
        Predicate<Integer> isGreaterThanTen = number -> number > 10;
        boolean test = isGreaterThanTen.test(9);
        System.out.println(test);
    }

    public static int add(int num) {
        return num + 1;
    }
}
