package Shapes;

public class ShapeCollection {
    private Shape[] shapes;

    public ShapeCollection(Shape[] shapes){
        this.shapes = shapes;

    }
    public void getPropertyValues() {
        for (Shape shape : shapes) {
            System.out.println(shape.printShapeType());
            System.out.println("Area: " + String.format("%.2f", shape.getArea()));
            System.out.println("Perimeter: " + String.format("%.2f", shape.getPerimeter()));
            System.out.println();
        }
    }
}
