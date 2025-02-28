package AccountAbstractExample.src.application;

import AccountAbstractExample.src.entities.Account;
import AccountAbstractExample.src.entities.BusinessAccount;
import AccountAbstractExample.src.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        // The line below causes an error, because an abstract class cannot be instantiated
        // Account acc1 = new Account(1, "Carlos", 1000.00);

        Account acc2 = new BusinessAccount(2, "Maria", 1000.00, 25000.00);
        Account acc3 = new SavingsAccount(3, "Bob", 1000.00, 1.5);
    }
}
