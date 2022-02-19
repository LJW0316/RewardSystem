package EXP4;
import java.util.Scanner;

public class test4_2 {
    public static void main(String[] args) {
        exp4_2 a = new exp4_2();
        exp4_2 b = new exp4_2();
        Scanner reader=new Scanner(System.in);
        System.out.println("请给a对象的x,y对象赋值：");
        a.setX(reader.nextDouble());
        a.setY(reader.nextInt());
        System.out.println("请给b对象的x,y对象赋值：");
        b.setX(reader.nextDouble());
        b.setY(reader.nextInt());
        System.out.println("a对象的x,y值分别是"+a.getX()+", "+a.getY());
        System.out.println("b对象的x,y值分别是"+b.getX()+", "+b.getY());
    }
}
