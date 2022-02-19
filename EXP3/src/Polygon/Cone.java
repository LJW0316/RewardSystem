package Polygon;

public class Cone {
    private Circle bottom;
    private double height;

    public Cone(Circle bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double getVolume(){
        return (bottom.getArea()*height)/3;
    }

    public void setBottomRadius(double radius) {
        this.bottom.setRadius(radius);
    }
}
