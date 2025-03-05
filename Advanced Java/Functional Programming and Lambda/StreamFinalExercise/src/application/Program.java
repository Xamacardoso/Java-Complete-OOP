package StreamFinalExercise.src.application;

import StreamFinalExercise.src.entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String filePath = "c:\\file\\newEmployees.csv";
        Scanner sc;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            sc = new Scanner(System.in);
            List<Employee> employees = new ArrayList<>();
            String line = reader.readLine();
            while (line != null) {
                String[] data = line.split(",");
                String employeeName = data[0];
                String employeeEmailAddress = data[1];
                Double employeeSalary = Double.parseDouble(data[2]);
                employees.add(new Employee(employeeName, employeeEmailAddress, employeeSalary));

                line = reader.readLine();
            }

            // Task: Show the email of all employees that have a salary bigger than user input, in ascending order
            System.out.print("Enter salary to filter: ");
            Double salaryThreshold = sc.nextDouble();

            System.out.println("Email of people whose salary is bigger than $" + salaryThreshold + ":");
            employees.stream()
                    .filter(employee -> employee.getSalary() > salaryThreshold)
                    .map(Employee::getEmail)
                    .sorted()
                    .forEach(System.out::println);

            // Sum of salary of people that have a name started with "M"
            Double salarySum = employees.stream()
                            .filter(x -> x.getName().charAt(0) == 'M')
                            .map(Employee::getSalary)
                            .reduce(0.0, (x, y) -> x + y);

            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f%n", salarySum);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
