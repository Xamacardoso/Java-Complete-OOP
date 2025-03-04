package DelimitedWildcards.src.application;

import DelimitedWildcards.src.entities.Circle;
import DelimitedWildcards.src.entities.Rectangle;
import DelimitedWildcards.src.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Circle(2.0));
        myShapes.add(new Rectangle(2.0, 3.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        // The line below does an error because the compiler does NOT understand
        // that List<Shape> is a superclass of Circle. To solve this, the method's
        // signature must be changed.
        // System.out.println("Total circles area: " + totalArea(myCircles));

        System.out.println("Total circles area: " + totalAreaWildcarded(myCircles));
        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<Shape> list) {
        double sum = 0.0;
        for (Shape shape : list) {
            sum += shape.area();
        }

        return sum;
    }
    
    // This method is now ready to receive a list of "Shape or any type that extends shape".
    // It's more flexible, and does not need to be the exact Shape class to work
    public static double totalAreaWildcarded(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape shape : list) {
            sum += shape.area();
        }

        return sum;
    }
}
