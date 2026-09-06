class Shape {
    private String name;
    Shape(String name) {
        this.name = name;
    }
    public String toString() {
        return "Shape: " + name;
    }
}
class Circle extends Shape {
    private double radius;
    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    double perimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Circle: Radius = " + radius + ", Area = " + area() + ", Perimeter = " + perimeter();}
}
class Rectangle extends Shape {
    private double length;
    private double width;
    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
    double perimeter() {
        return 2 * (length + width);
    }
    @Override
    public String toString() {
        return "Rectangle: Length = " + length + ", Width = " + width + ", Area = " + area() + ", Perimeter = " + perimeter();
    }
}
class Triangle extends Shape {
    private double base;
    private double height;
    Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }
    double area() {
        return (base * height) / 2;
    }
    @Override
    public String toString() {
        return "Triangle: Base = " + base + ", Height = " + height + ", Area = " + area();
    }
}
public class ShapeManagementApp {
    public static void main(String[] args) {
        Circle c1 = new Circle("Circle 1", 5);
        Rectangle r1 = new Rectangle("Rectangle 1", 4, 6);
        Triangle t1 = new Triangle("Triangle 1", 3, 4);
        System.out.println(c1);
        System.out.println("Area = " + c1.area());
        System.out.println("Perimeter = " + c1.perimeter());
        System.out.println(r1);
        System.out.println("Area = " + r1.area());
        System.out.println("Perimeter = " + r1.perimeter());
        System.out.println(t1);
        System.out.println("Area = " + t1.area());
    }
}
