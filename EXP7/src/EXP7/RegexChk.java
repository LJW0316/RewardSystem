package EXP7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexChk {
    public boolean check(String reg, String string) {
        boolean result = false;
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(string);
        result = matcher.matches();
        return result;
    }
    public boolean checkInt(String integer){
        String reg = "^(-?)[1-9]+\\d*|0";
        return check(reg, integer);
    }
    public boolean checkPhone(String num){
        String reg = "^[1]\\d{10}";
        return check(reg, num);
    }
    public boolean checkMail(String mail){
        String reg = "^.{3,}[@][a-zA-Z]+(\\.[a-zA-Z]+){1,2}";
        return check(reg, mail);
    }
    public boolean checkPostal(String postal){
        String reg = "^[1-9]\\d{5}";
        return check(reg, postal);
    }
    public boolean checkId(String id){
        String reg = "^[1-9]\\d{16}[0-9X]";
        return check(reg, id);
    }

}
