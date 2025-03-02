package InterfaceExample.src.model.services;

// Handles tax logic. Implements all methods in TaxService
public class BrazilTaxService implements TaxService {

    @Override
    public Double tax(Double amount) {
        if (amount <= 100.0){
            return amount * 0.2;
        }

        return amount * 0.15;
    }
}
