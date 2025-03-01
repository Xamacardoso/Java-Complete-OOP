package ExceptionVectorExample.src.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Indicates a block of code that can cause an exception that will be treated.
        // It's useful to maintain the application running when an error occurs
        // And treat exceptions hierarchically
        try {
            String[] stringVector = sc.nextLine().split(" ");
            int searchIndex = sc.nextInt();
            System.out.println(stringVector[searchIndex]);

        // Does the treatment if the exception is an (or instance of an) ArrayIndexOutOfBounds exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");

        // Treatment if user types an invalid type
        } catch (InputMismatchException e){
            System.out.println("Invalid type!");

        // This block executes even if an exception has occurred. It will always execute
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        // When an exception is not treated, the program will print the stack trace and ends.


        System.out.println("End of program.");
    }
}
