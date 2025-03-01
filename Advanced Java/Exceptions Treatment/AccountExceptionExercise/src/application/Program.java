package AccountExceptionExercise.src.application;

import AccountExceptionExercise.src.model.entities.Account;
import AccountExceptionExercise.src.model.exceptions.InvalidWithdrawException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter account number: ");
            int accountNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter account holder name: ");
            String accountHolderName = sc.nextLine();

            System.out.print("Enter account initial balance: ");
            Double initialBalance = sc.nextDouble();

            System.out.print("Withdrawal limit: ");
            Double withdrawalLimit = sc.nextDouble();

            Account acc = new Account(accountNumber, accountHolderName, initialBalance, withdrawalLimit);

            System.out.println("\nWithdrawing...");
            System.out.print("Enter withdrawal amount: ");
            Double withdrawalAmount = sc.nextDouble();

            acc.withdraw(withdrawalAmount);
            System.out.println("New balance: " + acc.getBalance());

        } catch (InvalidWithdrawException e){
            System.out.println("Withdrawal error: " + e.getMessage());

        } catch (InputMismatchException e){
            System.out.println("Invalid input: " + e.getMessage());

        } catch (RuntimeException e){
            System.out.println("Unexpected error: " + e.getMessage());

        }
    }
}
