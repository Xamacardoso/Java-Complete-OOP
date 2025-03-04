package ComparatorsExample.src.application;

import ComparatorsExample.src.entities.Product;
import ComparatorsExample.src.util.MyComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        /* Comparator is a functional interface (that haves only one abstract method)
        * that allows the programmer to define a custom sorting comparison for objects.
        * Comparators have different forms to be used.*/

        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Table", 300.0));
        products.add(new Product("Iphone X", 800.0));
        products.add(new Product("Gaming Laptop", 1200.0));

        // 1 - As a predefined class
        products.sort(new MyComparator());

        // 2 - As an anonymous class (this class is not created and stored)
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // 3 - As a lambda function (or arrow function) with curly braces
        products.sort((o1, o2) -> {
                return o1.getName().compareTo(o2.getName());
            }
        );

        // 4 - As a lambda function with no curly braces (works if there's only ONE statement)
        products.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        // 5 - Stored comparator as an arrow function
        Comparator<Product> comparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        products.sort(comparator);

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
