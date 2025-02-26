package WorkerExercise.src.application;

import WorkerExercise.src.entities.HourContract;
import WorkerExercise.src.entities.Worker;
import WorkerExercise.src.entities.enums.WorkerLevelEnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        // Date formatter for adding contracts
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        // New worker with name, level and salary
        Worker worker = new Worker(name, WorkerLevelEnum.valueOf(level), baseSalary);

        System.out.println("How many contracts to this worker? ");
        int contracts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < contracts; i++) {
            System.out.printf("Enter contract number #%d: %n", i+1);
            System.out.print("Date (DD/MM/YYYY): ");

            // Parses string into date
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            // Adds new contract to worker
            worker.addContract(new HourContract(contractDate, valuePerHour, duration));
            sc.nextLine();
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.nextLine();

        // Picks substring to use in worker's method
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3, 7));
        double income = worker.income(month, year);

        System.out.println("Name: " + worker.getName());
        System.out.println("Income for " + monthAndYear + ": " + income);

        sc.close();
    }
}
