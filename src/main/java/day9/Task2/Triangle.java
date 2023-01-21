package day9.Task2;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        return s;
    }

    @Override
    public double perimeter() {
        return this.a + this.b + this.c;
    }
}
