package DelimitedWildcards.src.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        copy(myDoubles, myObjs);

        printList(myObjs);
    }

    /** Using covariance and contravariance to solve a problem adding flexibility.
    * @param source a list of any type that is a Number or a subclass of it
    * @param destination a list of any type that is a Number or a superclass of it
    */
    public static void copy(List<? extends Number> source, List<? super Number> destination){
        for (Number number : source) {
            destination.add(number);
        }
    }

    public static void printList(List<? super Number> source){
        for (Object number : source) {
            System.out.println(number);
        }
    }
}
