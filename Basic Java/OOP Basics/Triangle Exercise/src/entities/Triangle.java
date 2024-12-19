package entities;

/* A class is a structured type that contains members, that can be
* attributes or methods (proper class functions/operations). Classes can have
* resources like constructors, inheritance, polymorphism, encapsulation
* and overload. Instances of classes are stored in the HEAP */

// This class represents a triangle that haves 3 sides and a method for calculating its area
public class Triangle {
    // Attributes
    public double sideA;
    public double sideB;
    public double sideC;

    // Methods
    public double calculateArea() {
        double p = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
    }
}
