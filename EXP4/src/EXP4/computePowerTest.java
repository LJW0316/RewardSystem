package EXP4;
import java.util.Scanner;

public class computePowerTest {
    public static void main(String[] args) {
        double a;
        double b;
        Parameter par=new Parameter();
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入两个double型参数的值");
        a = reader.nextDouble();
        b = reader.nextDouble();
        par.a=a;
        par.b=b;
        computePower.comPower(a,b);
        computePower.comPower(par);
        System.out.println("(1)主函数中参数1："+a+" 参数2："+b);
        System.out.println("(2)主函数中参数1："+par.a+" 参数2："+par.b);


    }





}
