package exp6;

public class UndergraduateException  extends Exception{
    String message;

    public UndergraduateException(double score){
        message="成绩："+score+"不在0-100范围内";
    }

    public String warnMess(){
        return message;
    }
}
