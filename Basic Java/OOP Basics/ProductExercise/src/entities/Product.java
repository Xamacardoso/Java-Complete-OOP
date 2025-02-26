package ProductExercise.src.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return this.quantity * this.price;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        }
    }

    /* Overriding default toString method. Now we can represent
    * this object as a string, making it easier to see.*/
    public String toString(){
        return "%s: %.2f, Amount in stock: %d %nTotal in Stock: R$%.2f".formatted(this.name, this.price, this.quantity, this.totalValueInStock());
    }
}
