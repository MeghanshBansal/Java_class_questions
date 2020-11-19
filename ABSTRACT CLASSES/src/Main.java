import Abstraction.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10, 20);
        Circle cir = new Circle(5);
        Square sq = new Square(3);
        rec.show();
        cir.show();
        sq.show();
    }
}
