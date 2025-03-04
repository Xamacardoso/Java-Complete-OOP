package MapExample.src.application;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        /*Map is a collection of key/values pair that DOESN'T
        * allow key repetitions. The elements are indexed by its
        * key object (they don't have positions like key[0]) and
        * have a fast access, insertion and deletion. Comparison of
        * elements is made the same way of sets.*/

        Map<Integer, Integer> map = new HashMap<>();

        // Adding values to a Map
        map.put(1, 2);
        map.put(1,57); // Overwriting the key/value
        map.put(2, 3);
        map.put(3, 4);

        // Removing a key
        map.remove(3);

        // Verifying if a key exists
        System.out.println("Contains 2: " + map.containsKey(2));

        // Getting a key's value
        System.out.println("Key 1 content: " + map.get(1));

        // Getting the values of the map. The values are given in a Collection object. Only values, not keys.
        System.out.println("Values: " + map.values());
    }
}
