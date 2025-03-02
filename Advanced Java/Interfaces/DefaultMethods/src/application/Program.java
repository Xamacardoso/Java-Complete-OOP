package DefaultMethods.src.application;

import DefaultMethods.src.model.services.BrazilInterestService;
import DefaultMethods.src.model.services.InterestService;
import DefaultMethods.src.model.services.USInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService brazilService = new BrazilInterestService(2.0);
        InterestService usService = new USInterestService(1.0);

        System.out.println("===== PAYMENTS ======");
        System.out.printf("Payment on Brazil after %d months - $ %.2f%n", months, brazilService.payment(amount, months));
        System.out.printf("Payment on USA after %d months - $ %.2f%n", months, usService.payment(amount, months));

        sc.close();
    }
}
