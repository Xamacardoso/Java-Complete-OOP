package SetExercise.src.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Integer> studentIdsCourseA = new HashSet<>();
        Set<Integer> studentIdsCourseB = new HashSet<>();
        Set<Integer> studentIdsCourseC = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("How many students on course A? ");
        int numStudentsA = sc.nextInt();
        for (int i = 0; i < numStudentsA; i++) {
            studentIdsCourseA.add(sc.nextInt());
        }

        System.out.print("How many students on course B? ");
        int numStudentsB = sc.nextInt();
        for (int i = 0; i < numStudentsB; i++) {
            studentIdsCourseB.add(sc.nextInt());
        }

        System.out.print("How many students on course C? ");
        int numStudentsC = sc.nextInt();
        for (int i = 0; i < numStudentsC; i++) {
            studentIdsCourseC.add(sc.nextInt());
        }

        Set<Integer> totalStudents = new HashSet<>();
        totalStudents.addAll(studentIdsCourseA);
        totalStudents.addAll(studentIdsCourseB);
        totalStudents.addAll(studentIdsCourseC);

        System.out.println("Total students: " + totalStudents.size());
    }
}
