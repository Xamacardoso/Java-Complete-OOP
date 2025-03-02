package ComparableInterface.src.application;

import ComparableInterface.src.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\file\\employees.txt";
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Double salary = Double.parseDouble(fields[1]);

                employees.add(new Employee(name, salary));
                line = br.readLine();
            }

            Collections.sort(employees);

            for (Employee employee : employees) {
                System.out.println(employee.getName() + " " + employee.getSalary());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
