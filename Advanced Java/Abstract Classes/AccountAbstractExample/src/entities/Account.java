package AccountAbstractExample.src.entities;

// An abstract class means that it cannot be instantiated directly, only non-abstract subclasses of itself
// It's a useful resource that provides polymorphism, code re-use, encapsulation and more organization
public abstract class Account {
    private Integer number; // "Private" means that only this class can access this field
    private String holder;
    protected Double balance;

    public Account(){}

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
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

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount){
        this.balance -= (amount + 5.0);
    }

    public void deposit(Double amount){
        this.balance += amount;
    }
}
