package DelimitedWildcards.src.entities;

public final class Circle implements Shape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area(){
        return Math.PI * radius * radius;
    }
}
