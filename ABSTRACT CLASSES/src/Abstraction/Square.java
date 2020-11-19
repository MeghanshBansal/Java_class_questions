package Abstraction;

public class Square extends Polynomial {
    double side;

    public Square(double side) {
        super(4);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return (side * side);
    }

    @Override
    public double perimeter() {
        return (4 * side);
    }
}
