package entities;

public class ListEmployee {
    private String name;
    private Integer id;
    private Double salary;

    public ListEmployee() {
    }

    public ListEmployee(String name, Integer id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseSalary(Double percentage) {
        this.salary += this.salary * percentage / 100;
    }

    @Override
    public String toString() {
        return "%d, %s, %.2f".formatted(id, name, salary);
    }
}
