package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class GradesProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.name = sc.nextLine();
        s1.grade1 = sc.nextDouble();
        s1.grade2 = sc.nextDouble();
        s1.grade3 = sc.nextDouble();

        double studentFinalGrade = s1.getFinalGrade();
        System.out.println("Final grade: " + studentFinalGrade);

        if (studentFinalGrade >= 60.0){
            System.out.println("Pass");
            return;
        }

        System.out.println("Failed!");
        System.out.printf("Missing %.2f points!", 60.0 - studentFinalGrade);

        sc.close();
    }
}
