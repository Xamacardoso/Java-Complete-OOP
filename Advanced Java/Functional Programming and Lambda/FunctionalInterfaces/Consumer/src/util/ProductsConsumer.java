package FunctionalInterfaces.Consumer.src.util;

import FunctionalInterfaces.Consumer.src.entities.Product;

import java.util.function.Consumer;

public class ProductsConsumer implements Consumer<Product> {

    // Accept method modifies a value without returning it
    @Override
    public void accept(Product prod) {
        prod.setPrice(prod.getPrice() * 2.0); // Doubles the price
    }
}
