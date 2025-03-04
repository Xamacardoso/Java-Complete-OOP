package FunctionalInterfaces.Function.util;

import FunctionalInterfaces.Consumer.src.entities.Product;

import java.util.function.Function;

public class ProductUppercaser implements Function<Product, String> {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
