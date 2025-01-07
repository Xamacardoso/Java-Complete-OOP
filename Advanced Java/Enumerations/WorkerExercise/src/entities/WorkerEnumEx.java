package entities;

import entities.enums.WorkerLevelEnumEx;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WorkerEnumEx {
    private String name;
    private WorkerLevelEnumEx level;
    private Double baseSalary;

    // When you have a "have many" composition, you DO NOT include the list attribute in the constructor
    // Also, you cannot allow that the list is swapped, so you do not include a set method to this attribute
    private List<HourContractEnumEx> contracts = new ArrayList<>();

    public WorkerEnumEx() {}

    public WorkerEnumEx(String name, WorkerLevelEnumEx level, Double baseSalary) {
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

    public WorkerLevelEnumEx getLevel() {
        return level;
    }

    public void setLevel(WorkerLevelEnumEx level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContractEnumEx> getContracts() {
        return contracts;
    }

    public void addContract(HourContractEnumEx contract){
        this.contracts.add(contract);
    }

    public void removeContract(HourContractEnumEx contract){
        this.contracts.remove(contract);
    }

    public Double income(int month, int year) {
        double sum = this.baseSalary;
        // Instance of calendar to verify contract month and year
        Calendar cal = Calendar.getInstance();
        for (HourContractEnumEx c : this.contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);

            if (c_year == year && c_month == month){
                sum += c.totalValue();
            }
        }

        return sum;
    }

}
