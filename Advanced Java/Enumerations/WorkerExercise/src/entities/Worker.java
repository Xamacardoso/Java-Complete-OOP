package WorkerExercise.src.entities;

import WorkerExercise.src.entities.enums.WorkerLevelEnum;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevelEnum level;
    private Double baseSalary;

    // When you have a "have many" composition, you DO NOT include the list attribute in the constructor
    // Also, you cannot allow that the list is swapped, so you do not include a set method to this attribute
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {}

    public Worker(String name, WorkerLevelEnum level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevelEnum getLevel() {
        return level;
    }

    public void setLevel(WorkerLevelEnum level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contracts.remove(contract);
    }

    public Double income(int month, int year) {
        double sum = this.baseSalary;

        // Instance of calendar to verify contract month and year
        Calendar cal = Calendar.getInstance();

        for (HourContract contract : this.contracts){
            cal.setTime(contract.getDate());
            int contract_year = cal.get(Calendar.YEAR);
            int contract_month = 1 + cal.get(Calendar.MONTH);

            if (contract_year == year && contract_month == month){
                sum += contract.totalValue();
            }
        }

        return sum;
    }

}
