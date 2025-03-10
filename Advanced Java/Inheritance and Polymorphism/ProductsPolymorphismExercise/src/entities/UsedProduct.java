package ProductsPolymorphismExercise.src.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public final class UsedProduct extends Product {
    private LocalDate manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public String priceTag() {
        return String.format("%s (used) - $ %.2f (Manufacture Date: %s)", name, price, manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
