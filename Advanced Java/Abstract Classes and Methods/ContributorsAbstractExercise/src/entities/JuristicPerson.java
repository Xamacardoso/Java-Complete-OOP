package ContributorsAbstractExercise.src.entities;

public final class JuristicPerson extends Person {
    private Integer employeeAmount;

    public JuristicPerson() {
    }

    public JuristicPerson(String name, Double income, Integer employeeAmount) {
        super(name, income);
        this.employeeAmount = employeeAmount;
    }

    public Integer getEmployeeAmount() {
        return employeeAmount;
    }

    public void setEmployeeAmount(Integer employeeAmount) {
        this.employeeAmount = employeeAmount;
    }

    @Override
    public Double calculateTax() {
        if (employeeAmount <= 10) {
            return anualIncome * 0.16;
        }

        return anualIncome * 0.14;
    }
}
