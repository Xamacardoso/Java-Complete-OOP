package src.application;

import src.model.entities.CarRental;
import src.model.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    /* WHAT IS AN INTERFACE??
    * Interface is a special type that defines a set of operations
    * that a class MUST implement. It's like a contract that a worker
    * HAVES to follow. It is useful to create flexible systems.*/
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

        sc.close();
    }
}
