package AbstractMethodExample.src.application;

import AbstractMethodExample.src.entities.Circle;
import AbstractMethodExample.src.entities.Rectangle;
import AbstractMethodExample.src.entities.Shape;
import AbstractMethodExample.src.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of shapes: ");
        int shapeAmount = sc.nextInt();
        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < shapeAmount; i++) {
            System.out.printf("Shape #%d data: %n", i+1);
            System.out.print("Rectangle or Circle (r/c)? ");
            char shapeChoice = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color shapeColor = Color.valueOf(sc.next());

            if (shapeChoice == 'r') {
                System.out.print("Width: ");
                Double shapeWidth = sc.nextDouble();
                System.out.print("Height: ");
                Double shapeHeight = sc.nextDouble();
                shapes.add(new Rectangle(shapeColor, shapeWidth, shapeHeight));
            }else {
                System.out.print("Radius: ");
                Double shapeRadius = sc.nextDouble();
                shapes.add(new Circle(shapeColor, shapeRadius));
            }

            // sc.nextLine();
        }

        System.out.println("\n===== SHAPE AREAS ====");
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }

        sc.close();
    }
}
