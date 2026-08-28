class Rectangle {
    private double width, height;
    public Rectangle() {
        this(1, 1);
    }
    public Rectangle(double side) {
        this(side, side);
    }
    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be positive");
        }
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public boolean isSquare() {
        return width == height;
    }
    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive");
        }
        width *= factor;
        height *= factor;
    }
    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", height=" + height + ", area=" + getArea() + ", perimeter=" + getPerimeter() + ", square=" + isSquare() + "}";
    }
}
public class RectangleModel {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        r3.scale(2);
        System.out.println("r3 after scaling: " + r3);
    }
}
