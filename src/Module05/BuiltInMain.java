package Module05;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class BuiltInMain {
    public static void main(String[] args) {
        // Function Example
        Function<Integer, Double> f1 = x -> 2.0 * x;

        double f1Result = f1.apply(10);
        System.out.printf("f1: %.2f%n", f1Result);

        // Predicate Example
        Predicate<Double> f2 = y -> y > 0.0;

        boolean f2Result = f2.test(-10.0);
        System.out.printf("f2: %b%n", f2Result);

        // BiPredicate Example
        BiPredicate<String, Integer> f3 = (a, b) -> a.length() > b;

        boolean f3Result = f3.test("mochi", 3);
        System.out.printf("f3: %b%n", f3Result);

        // Consumer Example
        Consumer<String> f4 = z -> System.out.println(z);
        f4.accept("Hello, world!");

        // Method Reference Example
        Consumer<String> f5 = System.out::println;
        f5.accept("Hello, world!");
    }
}
