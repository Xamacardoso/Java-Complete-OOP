package WildcardTypesExample.src.application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // GENERICS ARE INVARIANTS
        // List<Object> is NOT the supertype of any list type.
        // That's because myObjs have to be of the exact type Object,
        // due to Java's type safety system.
        List<Object> myObjs = new ArrayList<Object>();
        List<Integer> myInts = new ArrayList<Integer>();
        // myObjs = myInts; // Error

        // Now the attribution of myNewInts to myNewObjs is possible because
        // of the type "?". It's called a wildcard type, that can be of any type
        List<?> myNewObjs = new ArrayList<>();
        List<Integer> myNewInts = new ArrayList<>();
        myNewObjs = myNewInts;

        // But, it's not possible to add elements to a wildcard list because
        // the compiler does NOT know the type of the new element
        // myNewObjs.add(3);  // ERROR
    }
}
