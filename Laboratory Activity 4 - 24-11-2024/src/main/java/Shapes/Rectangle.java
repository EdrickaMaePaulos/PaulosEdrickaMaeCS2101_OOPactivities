package Shapes;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        double A = length * width;
        return A;
    }

    @Override
    public double getPerimeter() {
        double P = (2 * length) + (2 * width);
        return P;
    }

    @Override
    public String printShapeType() {
        return "Rectangle";
    }
}
