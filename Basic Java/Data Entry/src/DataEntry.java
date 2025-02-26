package src;

import java.util.Locale;
import java.util.Scanner;

public class DataEntry {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Sets the decimal number separator as "." instead of ","

        // Object for reading input data
        Scanner sc = new Scanner(System.in);

        // Reading strings
        String x;
        x = sc.next(); // Reads input until a space is found
        System.out.println("You've typed: " + x);

        // Reading int
        int num;
        num = sc.nextInt();
        System.out.println("You've typed: " + num);

        // Reading doubles
        double anynumber;
        anynumber = sc.nextDouble(); // Uses system's locale. In my case, uses "," as default separator for fractional nums
        System.out.println("You've typed: " + anynumber);

        // Reading multiple numbers with spaces between
        x = sc.next();
        num = sc.nextInt();
        anynumber = sc.nextDouble();
        System.out.println("Typed values: ");
        System.out.println(x);
        System.out.println(num);
        System.out.println(anynumber);

        // Terminates scanner resource
        sc.close();
    }
}
