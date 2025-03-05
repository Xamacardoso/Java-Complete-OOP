package StreamsAndPipeliness.src.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        /* Streams are a sequence of elements that come from a data source
        * that supports aggregated operations. It allows the programmer
        * to process sequences in a declarative way, without collateral
        * effects and in a thread safe way. The access to elements is
        * sequential (indices does not exist).*/

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Creating a stream from a list
        Stream<Integer> numbersStream = numbers.stream().map(x -> x * 5);
        System.out.println(Arrays.toString(numbersStream.toArray()));

        /* PIPELINES
        * Pipelines are a chain of operations over a stream. They must have:
        * 1 - Zero or more intermediate operations (one that produces a new stream)
        * 2 - One terminal operation (one that produces a non-stream object and ends stream processing)*/
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        // Pipeline example
        List<Integer> filteredNums = nums.stream()  // Creating a stream
                .filter(x -> x % 2 == 0)            // Filtering (intermediate)
                .map(x -> x * 5)                    // Mapping (intermediate)
                .toList();                          // Transforming into list (terminal)


        // The iterate stream generates theoretically infinite elements. Use limit (terminal operation) to control it
        Stream<Integer> evenNumbers = Stream.iterate(0, x -> x + 2);
        System.out.println(evenNumbers.limit(10).collect(Collectors.toList()));

        // Generating a fibonacci sequence using streams:
        Stream<Integer> fiboNumbers = Stream.iterate(new Integer[] {0, 1}, p -> new Integer[] {p[1], p[0] + p[1]})
                .map(x -> x[0]);
        System.out.println(fiboNumbers.limit(10).collect(Collectors.toList()));
    }
}
