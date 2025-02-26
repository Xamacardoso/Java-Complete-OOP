package HeightsExercise.src.application;

import HeightsExercise.src.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people? ");
        int n = sc.nextInt(); // Number of people in the array
        Person[] people = new Person[n];
        double heightSum = 0.0;

        // Assigning people data
        for (int i = 0; i < people.length; i++){
            sc.nextLine();
            System.out.printf("#%d Person data:\n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            heightSum += height;

            people[i] = new Person(age, name, height);
        }

        double heightAvg = heightSum / people.length;

        // Picking the sum of the people that are under age 16 for calculating its percentage
        double percentageUnderSixteen = 0.0;
        for (int i = 0; i < people.length; i++){
            if (people[i].getAge() < 16){
                percentageUnderSixteen += 1;
            }
        }

        percentageUnderSixteen = (percentageUnderSixteen / people.length) * 100;

        System.out.printf("\nAverage height: %.2f\n", heightAvg);
        System.out.printf("People under age 16: %.2f%%\n", percentageUnderSixteen);
        for (int i = 0; i < people.length; i++){
            if (people[i].getAge() < 16){
                System.out.println(people[i].getName());
            }
        }

        sc.close();
    }
}
