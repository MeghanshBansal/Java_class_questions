package Abstraction;

public class Circle extends Polynomial {
    double radius;

    public Circle(double radius) {
        super(0);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI * radius * radius);
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI * radius);
    }
}
