package application;

import entities.RentStudent;

import java.util.Locale;
import java.util.Scanner;

public class BoardingHouseProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rents will be made? ");
        int n = sc.nextInt();
        RentStudent[] rents = new RentStudent[10];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email address: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            rents[room] = new RentStudent(name, email);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.println(i + ": " + rents[i].getName() + ", " + rents[i].getEmail());
            }
        }
    }
}