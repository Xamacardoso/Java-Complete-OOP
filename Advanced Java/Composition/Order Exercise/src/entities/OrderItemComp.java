package entities;

public class OrderItemComp {
    private Integer quantity;
    private Double price;
    private ProductComp product;

    public OrderItemComp() {}
    public OrderItemComp(Integer quantity, Double price, ProductComp product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductComp getProduct() {
        return product;
    }

    public void setProduct(ProductComp product) {
        this.product = product;
    }

    public Double subTotal(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return "%s: $%.2f, Quantity: %d, Price: %.2f".formatted(product.getName(), price, quantity, subTotal());
    }
}
