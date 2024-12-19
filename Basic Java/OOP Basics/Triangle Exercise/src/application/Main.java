package application;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;

        // Class instantiation (creating object in the Heap)
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the A side of the X triangle: ");
        x.sideA = sc.nextDouble();
        System.out.println("Enter the B side of the X triangle: ");
        x.sideB = sc.nextDouble();
        System.out.println("Enter the C side of the X triangle: ");
        x.sideC = sc.nextDouble();
        System.out.println("Enter the A side of the Y triangle: ");
        y.sideA = sc.nextDouble();
        System.out.println("Enter the B side of the Y triangle: ");
        y.sideB = sc.nextDouble();
        System.out.println("Enter the C side of the Y triangle: ");
        y.sideC = sc.nextDouble();

        double areaX, areaY;
        areaX = x.calculateArea();
        areaY = y.calculateArea();

        System.out.printf("X Area: %.4f\n", areaX);
        System.out.printf("Y Area: %.4f\n", areaY);

        System.out.println("Larger Triangle: " + ((areaX > areaY)? "X": "Y"));


        sc.close();
    }
}
