abstract class Shape {
    private String color;
    Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public abstract double area();
    public abstract double perimeter();
}
class Circle extends Shape {
    private double radius;
    Circle(String color, double radius) {
        super(color);
        if (radius <= 0) {
            System.out.println("Invalid dimensions.");
        }

        this.radius = radius;
    }
    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    Rectangle(String color, double length, double width) {
        super(color);
        if (length <= 0 || width <= 0) {
            System.out.println("Invalid dimensions.");
        }
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;
    Triangle(String color, double base, double height,
             double side1, double side2, double side3) {
        super(color);
        if (base <= 0 || height <= 0 || side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid dimensions.");
        }
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double area() {
        return 0.5 * base * height;
    }
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
public class ShapeManagementApp {
        public static void main(String[] args) {
        Shape[] shapes = {new Circle("Red", 5), new Rectangle("Blue", 6, 4), new Triangle("Green", 6, 4, 5, 5, 6), new Circle("Yellow", 3), new Rectangle("Purple", 8, 3) };
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
