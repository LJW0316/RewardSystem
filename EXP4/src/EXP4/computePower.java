package EXP4;

public class computePower {
    public static void comPower(double par1,double par2) {
        par1=par1*par1;
        par2=par2*par2;
        System.out.println("(1)静态方法中参数1："+par1+" 参数2："+par2);
    }
    public static void comPower(Parameter par){
        par.a = par.a*par.a;
        par.b = par.b*par.b;
        par.a += par.b;
        System.out.println("(2)静态方法中参数1:"+par.a+" 参数2:"+par.b);
    }
}

class Parameter{
    public double a;
    public double b;

}

