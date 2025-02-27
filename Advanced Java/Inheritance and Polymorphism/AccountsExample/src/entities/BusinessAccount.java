package AccountsExample.src.entities;

// Inheritance allows the re-use of the code that already exists in the "Account" class;
// Now, this class has all members of "Account", including attributes and methods
// The "extends" keyword indicates the inheritance, meaning that a BusinessAccount is an Account
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

    public void loan(Double amount) {
        if (amount <= loanLimit){
            this.balance += amount - 10.0;
        }
    }
}
