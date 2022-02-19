package EXP4.exercise3;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Point a1=new Point();
        Point a2=new Point();
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入a1的坐标值");
        a1.setCoordinate(reader.nextInt(), reader.nextInt());
        System.out.println("请输入a2的坐标值");
        a2.setCoordinate(reader.nextInt(), reader.nextInt());
        Line l=new Line(a1,a2);
        System.out.println("由a1,a2构成的直线的长度为："+l.distance());
    }

}
