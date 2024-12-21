package entities;

public class BankAccount {
    private final int accountNumber;
    private String holder;
    private double balance;
    private static final double tax = 5.00;

    public BankAccount(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    // Overload: An OOP characteristic that allow multiple methods/constructor implementation,
    // But only if these methods have different signatures (no. of parameters, parameters types...)
    public BankAccount(int accountNumber, String holder, double initialDeposit) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void withdraw(double amount) {
        this.balance -= amount + tax;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public String toString(){
        return "Account Number: " + accountNumber + "\nHolder: " + holder + "\nBalance: $" + balance;
    }

}
