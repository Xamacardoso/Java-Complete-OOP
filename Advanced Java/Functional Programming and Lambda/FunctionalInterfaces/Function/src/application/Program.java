package FunctionalInterfaces.Function.src.application;

import FunctionalInterfaces.Consumer.src.entities.Product;
import FunctionalInterfaces.Function.util.ProductUppercaser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        /* Functions are functional interfaces that receive an object
        * as a parameter and return other object type.*/

        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 15.00));
        products.add(new Product("Banana", 20.00));
        products.add(new Product("Orange", 30.00));
        products.add(new Product("Grapes", 40.00));

        // Returns all products into uppercase name of products. Applies into all products the "ProductUppercaser"
        // List<String> names = products.stream().map(new ProductUppercaser()).collect(Collectors.toList());
        List<String> names = products.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
