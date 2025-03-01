package ReadingWithFileAndScanner.src.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // File object that represents an abstraction of a file access and its path
        File sourceFile = new File("c:\\file\\test.txt");

        Scanner sc = null;

        // Scanner assignment inside try block, because it can throw an exception when "opening" the file
        try {
            sc = new Scanner(sourceFile);

            // Verifies if the file haves any line remaining
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine()); // Prints next line
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
