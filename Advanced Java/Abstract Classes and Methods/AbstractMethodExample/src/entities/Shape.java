package AbstractMethodExample.src.entities;

import AbstractMethodExample.src.entities.enums.Color;

public abstract class Shape {
    protected Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // An abstract method cannot be implemented inside a more general class
    // It needs to be implemented on its subclasses
    // A class with, at least, one abstract method haves to be an abstract class
    public abstract Double area();
}
