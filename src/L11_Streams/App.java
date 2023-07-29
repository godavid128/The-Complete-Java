package L11_Streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        IntStream
                .range(1, 10)
                .forEach((x) -> System.out.print(x));
        System.out.println();

        // integer Stream with Skip
        IntStream
                .range(1, 10)
                .skip(5) // skip 5 elements of the stream
                .forEach((x) -> System.out.print(x));
        System.out.println();

        // Stream of sorted and findFirst
        Stream.of("hello", "bottle", "africa")
                .sorted()
                .findFirst()
                .ifPresent((x) -> System.out.println(x));

        // Stream from Array, sort, filter and print
        String[] items = {"car", "computer", "toothpaste", "box", "box", "toy"};
        Stream.of(items)
                .filter((x) -> x.startsWith("t"))
                .sorted()
                .forEach(x -> System.out.println(x + ", "));
        System.out.println();

        // Average of squares of an int array
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map((x) -> x * x)
                .average()
                .ifPresent(n -> System.out.println(n));
        System.out.println();
    }
}