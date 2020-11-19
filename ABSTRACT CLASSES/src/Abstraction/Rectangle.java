package Abstraction;

public class Rectangle extends Polynomial {
    double length;
    double width;

    public Rectangle(double length, double width) {
        super(4);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return (length * width);
    }

    @Override
    public double perimeter() {
        return (2 * (length + width));
    }
}
