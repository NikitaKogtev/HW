package day9.Task2;

public class Rectangle extends Figure {
    private double weight;
    private double length;

    public Rectangle(double weight, double length, String color) {
        super(color);
        this.weight = weight;
        this.length = length;
    }

    @Override
    public double area() {
        return weight * length;
    }

    @Override
    public double perimeter() {
        return 2 * (weight + length);
    }
}
