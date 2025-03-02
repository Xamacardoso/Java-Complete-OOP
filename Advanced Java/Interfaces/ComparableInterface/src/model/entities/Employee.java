package ComparableInterface.src.model.entities;

// Now employee is an object that can be compared to others, allowing collection sorting
public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // This is an implementation of how the class is compared
    // Returns an integer specifying if the object is lesser, equal or greater than the other
    @Override
    public int compareTo(Employee other) {
        // Comparison by name
        return getName().compareTo(other.getName());

        // Comparison by salary (ASC)
        // return getSalary().compareTo(other.getSalary());

        // Comparison by salary (DESC) note the minus signal
        // return -getSalary().compareTo(other.getSalary());
    }
}
