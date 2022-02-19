package Polygon;

public class Triangle {
    private double edge1;
    private double edge2;
    private double edge3;
    private double perimeter;
    Triangle(double l1, double l2, double l3){
        this.edge1 = l1;
        this.edge2 = l2;
        this.edge3 = l3;
        this.perimeter=edge1+ edge2 + edge3;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public boolean isTriangle() {
        return (edge1+ edge2 > edge3) && (edge2 + edge3 > edge1) && (edge1+ edge3 > edge2);
    }

    public void setEdge1(double edge1) {
        this.edge1 = edge1;
        this.perimeter = edge1+edge2+edge3;
    }

    public void setEdge2(double edge2) {
        this.edge2 = edge2;
        this.perimeter = edge1+edge2+edge3;
    }

    public void setEdge3(double edge3) {
        this.edge3 = edge3;
        this.perimeter = edge1+edge2+edge3;
    }
}
