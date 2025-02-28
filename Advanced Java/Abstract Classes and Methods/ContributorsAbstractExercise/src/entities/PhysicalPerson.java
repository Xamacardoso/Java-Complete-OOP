package ContributorsAbstractExercise.src.entities;

public final class PhysicalPerson extends Person {
    private Double healthcareCosts;

    public PhysicalPerson() {
    }

    public PhysicalPerson(String name, Double income, Double healthcareCosts) {
        super(name, income);
        this.healthcareCosts = healthcareCosts;
    }

    public Double getHealthcareCosts() {
        return healthcareCosts;
    }

    public void setHealthcareCosts(Double healthcareCosts) {
        this.healthcareCosts = healthcareCosts;
    }

    @Override
    public Double calculateTax() {
        Double tax;

        if (anualIncome < 20_000){
            tax = anualIncome * 0.15;
        } else {
            tax = anualIncome * 0.25;
        }

        tax -= (healthcareCosts * 0.5);
        return tax;
    }
}
