package EXP7;

public class Test {
    public static void main(String[] args) {
        RegexChk regex = new RegexChk();
        System.out.println("-0是否为整数："+regex.checkInt("-0"));
        System.out.println("1是否为整数："+regex.checkInt("1"));
        System.out.println("0是否为整数："+regex.checkInt("0"));
        System.out.println("-1是否为整数："+regex.checkInt("-1"));
        System.out.println("15000875955是否为手机号码："+regex.checkPhone("15000875955"));
        System.out.println("138aaa11是否为手机号码："+regex.checkPhone("138aaa11"));
        System.out.println("frank@hotmail.com是否为邮箱："+regex.checkMail("frank@hotmail.com"));
        System.out.println("frank@hotmail.com.cn是否为邮箱："+regex.checkMail("frank@hotmail.com.cn"));
        System.out.println("a@b是否为邮箱："+regex.checkMail("a@b"));
        System.out.println("200333是否为邮编："+regex.checkPostal("200333"));
        System.out.println("0111是否为邮编："+regex.checkPostal("0111"));
        System.out.println("310108200000002811是否为身份证号码："+regex.checkId("310108200000002811"));
        System.out.println("31010820000000281X是否为身份证号码："+regex.checkId("31010820000000281X"));
        System.out.println("31010820000000281b是否为身份证号码："+regex.checkId("31010820000000281b"));
    }
}
