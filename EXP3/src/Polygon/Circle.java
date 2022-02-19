package Polygon;

public class Circle {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        area = Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        area = Math.PI * radius * radius;
    }

    public double getArea() {
        return area;
    }
}
