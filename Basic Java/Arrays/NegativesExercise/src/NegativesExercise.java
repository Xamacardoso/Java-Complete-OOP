import java.util.Locale;
import java.util.Scanner;

/* Write a program that reads how many numbers the user will enter,
* read all of them and show all the negative numbers that the user typed */
public class NegativesExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will you type? ");
        int n = sc.nextInt();

        // Creating a vector
        int numbers[] = new int[n];
        for (int i = 0; i < numbers.length; i++){
            System.out.printf("Enter the #%d number: ", i+1);
            numbers[i] = sc.nextInt(); // Assigns the number in the 'i' position of the vector
        }

        System.out.println("\nNEGATIVE NUMBERS: ");
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < 0){
                System.out.println(numbers[i]);
            }
        }

        sc.close();
    }
}
