package InterfaceExample.src.application;

import InterfaceExample.src.model.entities.CarRental;
import InterfaceExample.src.model.entities.Invoice;
import InterfaceExample.src.model.entities.Vehicle;
import InterfaceExample.src.model.services.BrazilTaxService;
import InterfaceExample.src.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data: ");
        System.out.print("Enter car model: ");
        String rentalCarModel = sc.nextLine();
        System.out.print("Enter rental START date (dd/MM/yyyy HH:mm): ");
        LocalDateTime rentalStartDate = LocalDateTime.parse(sc.nextLine(), dateFormatter);
        System.out.print("Enter rental FINISH date (dd/MM/yyyy HH:mm): ");
        LocalDateTime rentalFinishDate = LocalDateTime.parse(sc.nextLine(), dateFormatter);

        CarRental rental = new CarRental(rentalStartDate, rentalFinishDate, new Vehicle(rentalCarModel));

        System.out.print("Value per hour: ");
        Double serviceValuePerHour = sc.nextDouble();
        System.out.print("Value per day: ");
        Double serviceValuePerDay = sc.nextDouble();

        BrazilTaxService taxService = new BrazilTaxService();
        RentalService rentalService = new RentalService(serviceValuePerHour, serviceValuePerDay, taxService);
        rentalService.processInvoice(rental);

        Invoice invoice = rental.getInvoice();
        System.out.println("==== INVOICE ====");
        System.out.printf("Basic payment: $ %.2f%n", invoice.getBasicPayment());
        System.out.printf("Tax: $ %.2f%n", invoice.getTax());
        System.out.printf("Total payment: $ %.2f%n", invoice.getTotalPayment());

        sc.close();
    }
}
