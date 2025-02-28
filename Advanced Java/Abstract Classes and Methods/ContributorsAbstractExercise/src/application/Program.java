package ContributorsAbstractExercise.src.application;

import ContributorsAbstractExercise.src.entities.JuristicPerson;
import ContributorsAbstractExercise.src.entities.Person;
import ContributorsAbstractExercise.src.entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int personAmount = sc.nextInt();
        List<Person> persons = new ArrayList<Person>();

        for (int i = 0; i < personAmount; i++) {
            System.out.printf("Tax payer #%d data:%n", i+1);
            System.out.print("Individual or company (i/c)? :");
            char personType = sc.next().charAt(0);
            sc.nextLine(); // Buffer reset

            System.out.print("Name: ");
            String personName = sc.nextLine();

            System.out.print("Annual income: ");
            Double personAnnualIncome = sc.nextDouble();

            if (personType == 'c') {
                System.out.print("Employee amount: ");
                Integer personEmployeeAmount = sc.nextInt();
                persons.add(new JuristicPerson(personName, personAnnualIncome, personEmployeeAmount));

            } else {
                System.out.print("Healthcare expenditures: ");
                Double personHealthcareExpenditures = sc.nextDouble();
                persons.add(new PhysicalPerson(personName, personAnnualIncome, personHealthcareExpenditures));
            }
        }

        Double totalTaxes = 0.0;
        System.out.println("===== TAXES PAID =====");
        for (Person person : persons) {
            Double personTax = person.calculateTax();
            System.out.printf("%s - $ %.2f %n", person.getName(), personTax);
            totalTaxes += personTax;
        }

        System.out.printf("%nTOTAL TAXES: $ %.2f %n", totalTaxes);
        sc.close();
    }
}
