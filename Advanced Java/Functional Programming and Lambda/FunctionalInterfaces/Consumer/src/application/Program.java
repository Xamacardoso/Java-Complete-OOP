package FunctionalInterfaces.Consumer.src.application;

import FunctionalInterfaces.Consumer.src.entities.Product;
import FunctionalInterfaces.Consumer.src.util.ProductsConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        /* Consumer is a functional interface that consumes
        * a value, but does not return it. Abstract method:
        * void accept(T t);
        */

        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 15.0));
        products.add(new Product("Banana", 30.0));
        products.add(new Product("Coconut", 45.0));

        // The ways to use a consumer are the same in the predicate uses.

        // products.forEach(new ProductsConsumer());

        // products.forEach(x -> x.setPrice(x.getPrice() * 2.0));

        // Consumer<Product> consumer = x -> x.setPrice(x.getPrice() * 2.0);
        // products.forEach(consumer);

        products.forEach(System.out::println);
    }
}
