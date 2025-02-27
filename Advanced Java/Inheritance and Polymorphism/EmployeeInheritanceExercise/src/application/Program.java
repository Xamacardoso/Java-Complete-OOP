package EmployeeInheritanceExercise.src.application;

import EmployeeInheritanceExercise.src.entities.Employee;
import EmployeeInheritanceExercise.src.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();
        List<Employee> employees = new ArrayList<>();

        // Adding employees
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.printf("Employee #%d data:\n", i+1);

            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            sc.nextLine(); // Buffer reset

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        // Displaying payments
        System.out.println("==== PAYMENTS ====");
        for (Employee employee : employees) {
            System.out.printf("%s - $ %.2f\n", employee.getName(), employee.payment());
        }

        sc.close();
    }
}
