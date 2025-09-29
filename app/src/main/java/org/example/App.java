package org.example;


public class App {
    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        Rectangle r = new Rectangle(4.0, 5.0);
        Square s = new Square(2.5);
        RightTriangle rt = new RightTriangle(3.0, 4.0);
        IsoscelesRightTriangle irt = new IsoscelesRightTriangle(5.0);

        Shape[] shapes = {c, r, s, rt, irt};

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName() + " ");
            System.out.println("Area: " + shape.getArea() + " ");
            System.out.println("Perimeter: " + shape.getPerimeter() + " ");
            if (shape instanceof Polygon) {
                Polygon polygon = (Polygon) shape;
                System.out.println("Number of sides: " + polygon.numberOfSides());
            }
            System.out.println();
        }
    }
}
