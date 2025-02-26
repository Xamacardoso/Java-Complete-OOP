package VectorSumExercise.src;

import java.util.Locale;
import java.util.Scanner;

/* Write a program that reads N real numbers and store them in an array. Then:
* - Print all elements of the array
* - Show the sum of all elements and it's average
*/
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will you type? ");
        int n = sc.nextInt();

        double numbers[] = new double[n];
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter #" + (i+1) + " number: ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        System.out.print("VALUES = ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%.1f ", numbers[i]);
        }

        System.out.printf("\nSUM = %.2f\n", sum);
        System.out.printf("AVERAGE = %.2f", sum/numbers.length);

        sc.close();
    }
}
