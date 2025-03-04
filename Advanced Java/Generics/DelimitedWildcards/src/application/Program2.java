package DelimitedWildcards.src.application;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        // List of any type that is number or a subclass of it
        // Here you can GET elements as Number or superclass of it but CANNOT add any element
        List<? extends Number> list = intList;

        // The situation below is called "Covariance" - when a
        // "get" operation is allowed but "put" operation is not possible.
        Number x = list.get(0);
        Object x1 = list.get(1);

        /* list.add(20); Compilation error - The compiler understands that the more specific type may not be
        compatible with other subclass of Number */
        // Integer x1 = list.get(1); - Compilation error. Same reason above.
        Integer y1 = 1;

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        // A list of any type that is Number or any superclass of it.
        // Here you can ADD elements as a number or subclass of it but CANNOT get them
        // (exception: you can get only through the more GENERAL superclass)
        List<? super Number> myNums = myObjs;

        // Now this situation is the opposite of covariance
        // It's called "Contravariance" - when "get" is not possible, but "put" is possible.
        myNums.add(10);
        myNums.add(3.14);

        /* Number y = myNums.get(0); // Compilation error - The compiler understands that the more general type
        may not be a Number. Adding is allowed because  any Number (or subtype) is compatible
        with any supertype of Number. But when getting, we can't guarantee which specific
        supertype the list actually contains, so we can only treat elements as Object. */
    }
}
