package Shapes;

public class Square implements Shape{
    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double getArea() {
        double A = side * side;
        return A;
    }

    @Override
    public double getPerimeter() {
        double P = 4 * side;
        return P;
    }

    @Override
    public String printShapeType() {
        return "Square";
    }
}
