package AccountExceptionExercise.src.model.entities;

import AccountExceptionExercise.src.model.exceptions.InvalidWithdrawException;

public final class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawalLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawalLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawalLimit = withdrawalLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(Double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount){
        validateWithdraw(amount);
        this.balance -= amount;
    }

    public void validateWithdraw(Double amount){
        if (amount > this.balance){
            throw new InvalidWithdrawException("Insufficient balance!");
        }

        if (amount > this.withdrawalLimit){
            throw new InvalidWithdrawException("Withdrawal limit exceeded!");
        }
    }
}
