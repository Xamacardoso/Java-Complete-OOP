package FunctionalInterfaces.Predicate.src.util;

import java.util.function.Predicate;

public class MyIntegerPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }

    public static boolean staticTest(Integer integer){
        return integer % 2 == 0;
    }
}
