package Abstraction;

public abstract class Polynomial {
    int no_of_side;
    public Polynomial(int x){
        this.no_of_side = x;
    }
    public abstract double area();
    public abstract double perimeter();
    public void show(){
        System.out.println("Perimeter: " + perimeter() + " Area: " + area());
    }
}
