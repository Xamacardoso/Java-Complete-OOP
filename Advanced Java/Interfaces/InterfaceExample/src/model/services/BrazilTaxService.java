package src.model.services;

// Handles tax logic
public class BrazilTaxService {

    public Double tax(Double amount) {
        if (amount <= 100.0){
            return amount * 0.2;
        }

        return amount * 0.15;
    }
}
