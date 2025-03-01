package CustomExceptionExample.src.application;

import CustomExceptionExample.src.model.entities.Reservation;
import CustomExceptionExample.src.model.exceptions.DomainException;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Scanner instantiation on try block to optimize resources
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date roomCheckIn = Reservation.dateFormat.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date roomCheckOut = Reservation.dateFormat.parse(sc.next());

            Reservation res = new Reservation(roomNumber, roomCheckIn, roomCheckOut);
            System.out.println("Reservation: " + res.toString());

            System.out.println("=== Reservation update ===");
            System.out.println("New check-in date (dd/MM/yyyy): ");
            Date newCheckIn = Reservation.dateFormat.parse(sc.next());

            System.out.println("New check-out date (dd/MM/yyyy): ");
            Date newCheckOut = Reservation.dateFormat.parse(sc.next());

            res.updateDates(newCheckIn, newCheckOut);
            System.out.println("\nUpdated reservation: " + res.toString());

        } catch (ParseException e) {
            System.out.println("Invalid date format!");

        } catch (DomainException e) {
            System.out.println("Error on reservation: " + e.getMessage());

        }
    }
}
