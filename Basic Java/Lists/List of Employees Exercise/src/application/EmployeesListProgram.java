package application;

import entities.ListEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeesListProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees? ");
        int n = sc.nextInt();

        List<ListEmployee> employees = new ArrayList<ListEmployee>();
        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Buffer reset
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine(); // Buffer reset
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new ListEmployee(name, id, salary));
        }
        sc.nextLine();

        System.out.print("Enter the emplooyee id that will have salary increase: ");
        Integer idSalary = sc.nextInt();
        Integer position = salaryPosition(employees, idSalary);
        if (position == null){
            System.out.println("Employee not found! Non-existent Id");
        } else {
            System.out.print("Enter the percentage of salary increase for this employee: ");
            double percentage = sc.nextDouble();
            employees.get(position).increaseSalary(percentage);
        }

        for (ListEmployee employee : employees) {
            System.out.println(employee.toString());
        }
        sc.close();
    }

    public static Integer salaryPosition(List<ListEmployee> employees, Integer id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)) {
                return i;
            }
        }
        return null;
    }
}
