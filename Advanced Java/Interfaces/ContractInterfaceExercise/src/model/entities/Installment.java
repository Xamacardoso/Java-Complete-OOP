package ContractInterfaceExercise.src.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
    private Double amount;
    private Date dueDate;

    private final static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Installment(Double amount, Date dueDate) {
        this.amount = amount;
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return dateFormat.format(this.dueDate) + " - $ " + String.format("%.2f", this.amount);
    }
}
