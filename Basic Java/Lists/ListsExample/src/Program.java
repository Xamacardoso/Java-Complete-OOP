package ListsExample.src;

import java.util.ArrayList;
import java.util.List;

public class Program {
    /* A List is a data structure that is used to store many elements
    - It is homogeneous (the whole list must have only one type)
    - It initially starts empty, the elements inside her are allocated on demand
    - It is expansible, unlike arrays
    * */

    public static void main(String[] args) {

        // List, here, is an interface that is instantiated using a CLASS
        // THAT IMPLEMENTS this interface (ArrayList is the CLASS, List is the INTERFACE)
        List<String> listinha = new ArrayList<String>();

        // Adds elements in the "listinha" list
        listinha.add("Abestaiado");
        listinha.add("Alexandre");
        listinha.add("Nicolas");

        // Adds the element in the index 1, between Abestaiado and Alexandre
        listinha.add(1, "Piola");

        // Removes an element of the list that matches with the instance "Nicolas"
        listinha.remove("Nicolas");

        // Removes an element of the list based on the given index
        listinha.remove(2);

        // Removes all elements that fit in the given predicate (arrow function)
        listinha.removeIf(x -> x.charAt(0) == 'A');

        // listinha.size() shows how many elements exist in the list
        System.out.println("Size: " + listinha.size());
        for (String x: listinha){
            System.out.println(x);
        }
        System.out.println("-------------");
        // List now contains only "Piola"

        listinha.add("Marcos");
        listinha.add("Mileena");
        listinha.add("Juan");

        String firstThatStartsWithJ = listinha.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println("Magic Word: " + firstThatStartsWithJ);

        // Filters the list based in a predicate (lambda) and returns it to store in a variable
        List<String> result = listinha.stream().filter(x -> x.charAt(0) == 'M').toList();
        for (String x : result){
            System.out.println(x);
        }


    }
}
