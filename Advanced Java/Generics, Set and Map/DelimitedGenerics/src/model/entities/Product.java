package DelimitedGenerics.src.model.entities;

// Comparable interface to get the "maximum" of a product
public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return this.price.compareTo(other.getPrice());
    }

    @Override
    public String toString() {
        return String.format("%s, $ %.2f", name, price);
    }
}
