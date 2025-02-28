package AccountAbstractExample.src.entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // Replicates the behavior of the superclass (more general class) constructor
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount); // Executes the behavior of the superclass
        balance -= 2; // and executes this behavior
    }

    public void loan(Double amount) {
        if (amount <= loanLimit){
            this.balance += amount - 10.0;
        }
    }
}
