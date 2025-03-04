package FunctionalInterfaces.Predicate.src.application;

import FunctionalInterfaces.Predicate.src.util.MyIntegerPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        /* Predicate is a functional interface (interfaces that only have one
        * abstract method that is normally implemented as a lambda function) that
        * tests a determined condition and returns a boolean value.
        */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // There are some ways to use predicates

        // 1 - Lambda predicate
        numbers.removeIf(x -> x % 2 == 0);

        // 2 - Using an implementation of the "test" method of predicate interface
        numbers.removeIf(new MyIntegerPredicate());

        // 3 - Using a static (or non-static) method reference
        numbers.removeIf(MyIntegerPredicate::staticTest);

        // 4 - Using a stated predicate
        Predicate<Integer> pred = x -> x % 2 == 0;
        numbers.removeIf(pred);
    }
}
