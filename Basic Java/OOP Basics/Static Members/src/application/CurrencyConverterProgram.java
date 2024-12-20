package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price?: ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars?: ");
        double dollars = sc.nextDouble();

        // Calling static method without instantiation
        System.out.println("Amount to be paid in reais: " + CurrencyConverter.dollarToReal(dollars, dollarPrice));
        sc.close();
    }
}
