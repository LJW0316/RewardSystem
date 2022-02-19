package exp6;

public class Undergraduate extends Student implements Manageable{
    double aver;

    @Override
    public String getDegree() {
        if(this.getPass())
            return Constants.ISSUE_UNDERGRADUATE_DEGREE;
        else
            return Constants.UNSATISFACTORY_ISSUE_UNDERGRADUATE_DEGREE;
    }

    @Override
    public double computeAverage() throws UndergraduateException {
        double sum = 0;
        int counter = 0;
        for(double i : score){
            if(i<0||i>100){
                throw new UndergraduateException(i);
            }
            sum += i;
            counter++;
        }
        aver = sum/counter;
        return aver;
    }

    @Override
    public boolean getPass() {
        if(aver>=60) {
            this.setStatus(true);
            return true;
        }
        else
            return false;
    }

    @Override
    public void printInfo() {
        System.out.println("姓名："+this.getName());
        System.out.println("性别："+this.getGender());
        System.out.printf("出生日期：%tF%n",this.getBirthday());
        System.out.println("学校："+this.getSchool());
        System.out.println("学号："+this.getStuId());
        System.out.println("学生类别："+this.getCategory());
        System.out.println("各门课成绩：");
        for(double i : score){
            System.out.println(i);
        }
        System.out.println("颁发学位状况:"+getDegree());
    }
}
