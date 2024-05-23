package java2.day3;

import java1.day3.Person;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> collect = IntStream.iterate(1, x -> x + 3)
                .filter(x -> (x % 2 != 0) && (x % 5 == 0))
                .limit(5)
                .peek(System.out::println)
                .mapToObj(x -> "Число: " + x)
                .collect(Collectors.toList());

        System.out.println(collect);


//        Stream<Person> persStream = Stream.iterate()
    }
}
