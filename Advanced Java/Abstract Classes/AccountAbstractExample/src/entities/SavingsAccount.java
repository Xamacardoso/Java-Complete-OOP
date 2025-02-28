package AccountAbstractExample.src.entities;

// A class defined with "final" CANNOT be inherited. It is the final extension of a class
// A final method can't be overwritten either
public final class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount() {}

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override // Overwrites a behavior that exists in a superclass
    public void withdraw(Double amount) {
        balance -= amount;
    }

    public void updateBalance(){
        balance += (balance * interestRate);
    }
}
