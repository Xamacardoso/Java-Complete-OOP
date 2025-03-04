package ComparatorsExample.src.util;

import ComparatorsExample.src.entities.Product;

import java.util.Comparator;

// This class is used exclusively to compare elements of a collection of Products.
// That helps to obey the open/closed principle, in a structured and readable way.
public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
