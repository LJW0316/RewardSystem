package EXP4.exercise3;

public class Line {
    Point a1;
    Point a2;

    public Line(Point a1, Point a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public void setA1(Point a1) {
        this.a1 = a1;
    }

    public void setA2(Point a2) {
        this.a2 = a2;
    }

    public double distance() {
        return Math.sqrt(Math.pow(a1.horizontalCoordinate-a2.horizontalCoordinate,2)
        +Math.pow(a1.verticalCoordinate- a2.verticalCoordinate,2));
    }
}
