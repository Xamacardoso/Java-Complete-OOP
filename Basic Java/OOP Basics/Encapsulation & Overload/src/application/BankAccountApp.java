package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount account;
        System.out.print("Enter account number: ");
        int accountNum = sc.nextInt();
        sc.nextLine(); // Buffer reset

        System.out.print("Enter account holder's name: ");
        String holderName = sc.nextLine();

        System.out.print("Is there an initial deposit? (y/n): ");
        String response = sc.nextLine();

        if (response.equals("y")) {
            System.out.print("Enter initial deposit amount: ");
            double depositAmount = sc.nextDouble();
            account = new BankAccount(accountNum, holderName, depositAmount);
        } else {
            account = new BankAccount(accountNum, holderName);
        }

        System.out.println("Account data:\n" + account.toString());

        System.out.print("Enter a deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Updated account data:\n" + account.toString());

        System.out.println("Enter a withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();
        account.withdraw(withdrawalAmount);

        System.out.println("Updated account data:\n" + account.toString());
        sc.close();
    }
}
