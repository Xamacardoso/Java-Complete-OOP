package SetExample.src.application;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        /* Set is a type that represents a collection of elements
        * that doesn't have repeated numbers. The numbers also don't
        * have positions. Accessing, adding or removing elements from
        * a Set are very, very quick operations!! */
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> numbers2 = new HashSet<>();
        Set<Integer> numbers3 = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.remove(3);

        // This operation is based on equals and hashcode. If object
        // doesn't have them, pointer comparison is done.
        boolean x = numbers.contains(3);
        System.out.println("Size of numbers: " + numbers.size());
        numbers.clear();
        System.out.println("New size of numbers after clear: " + numbers2.size());

        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);

        numbers3.add(5);
        numbers3.add(6);
        numbers3.add(7);
        numbers3.add(8);

        // Union (adds elements of other set without repetition)
        numbers3.addAll(numbers2);

        // Intersection (remove all elements that exists in nums2 but NOT in nums3)
        numbers2.retainAll(numbers3);

        // Difference (remove all elements that exist in the other set)
        numbers3.removeAll(numbers2);
    }
}
