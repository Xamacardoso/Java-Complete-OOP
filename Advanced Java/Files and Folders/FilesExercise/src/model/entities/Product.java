package FilesExercise.src.model.entities;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product() {
    }

    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public Integer getQuantity() {
        return quantity;
    }

    public Double totalPrice(){
        return this.price * this.quantity;
    }

    public String summarize(){
        return String.format("%s,%.2f", name, totalPrice());
    }
}