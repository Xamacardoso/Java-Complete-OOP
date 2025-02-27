package AccountsExample.src.application;

import AccountsExample.src.entities.Account;
import AccountsExample.src.entities.BusinessAccount;
import AccountsExample.src.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1, "Joao", 100.0);
        BusinessAccount bacc = new BusinessAccount(2, "Maria", 500.0, 300.0);

        // UPCASTING - Casting a subclass into a superclass
        Account acc1 = bacc; // This does not throws an error, because a business account is an account
        Account acc2 = new BusinessAccount(3, "Bozo", 100.0, 50.0);
        Account acc3 = new SavingsAccount(4, "Ximas", 100.0, 1.5);

        // DOWNCASTING - Converting a superclass object into a subclass object
        // The line below throws an error because it does not convert automatically an account into a subclass of it
        // BusinessAccount acc4 = acc2;
        BusinessAccount acc4 = (BusinessAccount) acc2; // However, the conversion can be done manually using CASTING

        // This line below also throws an error, because during RUNTIME, the compiler
        // recognizes that the type that is being cast is not compatible
        // BusinessAccount acc5 = (BusinessAccount) acc3;

        // The operator instanceof verifies if a, object is an
        // instance of a determined class or subclass
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Balance updated!");
        }

        acc2.withdraw(10.0);
        acc3.withdraw(10.0);

        System.out.println(acc2.getBalance());
        System.out.println(acc3.getBalance());
    }
}
