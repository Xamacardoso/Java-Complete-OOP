package src.model.services;

import src.model.entities.CarRental;
import src.model.entities.Invoice;

import java.time.Duration;

// Service for handling rental operations
public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    // Now it's an interface. There can be many different tax services.
    // So we use this to make this rental service more general.
    private TaxService taxService;

    // Note the dependency injection on tax service (tax service is now instantiated externally)
    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void processInvoice(CarRental rental){

        double minutes = Duration.between(rental.getStartTime(), rental.getFinishTime()).toMinutes();
        double hours = Math.ceil(minutes / 60);

        System.out.println("Hours: " + hours);

        double basicPayment;
        if (hours <= 12) {
            basicPayment = hours * pricePerHour;

        } else {
            double days = Math.ceil(hours / 24);
            basicPayment = days * pricePerDay;
        }

        double tax = taxService.tax(basicPayment);
        rental.setInvoice(new Invoice(basicPayment, tax));
    }
}
