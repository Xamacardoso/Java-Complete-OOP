package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.print("Enter the height of the rectangle: ");
        rectangle.height = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        rectangle.width = sc.nextDouble();

        System.out.printf("AREA = %.2f\n" +
                "PERIMETER = %.2f\n" +
                "DIAGONAL = %.2f\n",
                rectangle.area(), rectangle.perimeter(), rectangle.diagonal());
        sc.close();
    }
}
