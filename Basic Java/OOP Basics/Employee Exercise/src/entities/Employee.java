package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage){
        this.grossSalary += this.grossSalary * percentage / 100.0;
    }

    public String toString(){
        return "%s, Net salary: %.2f".formatted(this.name, this.netSalary());
    }
}
