package Polygon;
import java.util.Scanner;

public class exp3_2 {
    public static void main(String[] args) {
        Triangle triangle;
        Scanner reader;
        reader = new Scanner(System.in);
        System.out.println("边1:");
        double edge_1=reader.nextDouble();
        System.out.println("边2:");
        double edge_2=reader.nextDouble();
        System.out.println("边3:");
        double edge_3=reader.nextDouble();
        triangle = new Triangle(edge_1,edge_2,edge_3);
        System.out.println("初始三角形的周长为"+triangle.getPerimeter());

        System.out.println("请修改三条边的变长");
        System.out.println("边1:");
        double edge=reader.nextDouble();
        triangle.setEdge1(edge);
        System.out.println("边2:");
        edge=reader.nextDouble();
        triangle.setEdge2(edge);
        System.out.println("边3:");
        edge=reader.nextDouble();
        triangle.setEdge3(edge);
        if(triangle.isTriangle())
            System.out.println("修改后仍是三角形");
        else
            System.out.println("修改后不是三角形");

        Circle circle;
        System.out.println("请输入圆的半径");
        double radius = reader.nextDouble();
        circle = new Circle(radius);
        System.out.println("圆的面积是"+circle.getArea());

        Cone cone;
        System.out.println("请输入圆锥体的高（默认使用本例中的圆作为底)");
        double height = reader.nextDouble();
        cone = new Cone(circle,height);
        System.out.println("请输入修改后底的半径");
        radius = reader.nextDouble();
        cone.setBottomRadius(radius);
        System.out.println("圆锥体的体积为"+cone.getVolume());


    }
}
