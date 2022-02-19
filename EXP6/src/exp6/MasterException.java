package exp6;

public class MasterException extends Exception{
    String message;

    public MasterException(double score,char grade,int choose){
        if(choose==0)
            message="成绩："+score+"不在0-100范围内";
        else
            message="论文等级："+grade+"不在A-E范围内";
    }

    public String warnMess(){
        return message;
    }
}
