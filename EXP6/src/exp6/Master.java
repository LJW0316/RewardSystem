package exp6;

public class Master extends Student implements Manageable{
    double aver;
    char thesisLevel;

    public char getThesisLevel() {
        return thesisLevel;
    }

    public void setThesisLevel(char thesisLevel) {
        this.thesisLevel = thesisLevel;
    }

    @Override
    public double computeAverage() throws MasterException {
        double product = 1;
        int counter = 0;
        if(thesisLevel<'A'||thesisLevel>'E')
            throw new MasterException(0,thesisLevel,1);
        for(double i : score){
            if(i<0||i>100)
                throw new MasterException(i,thesisLevel,0);
            product *= i;
            counter++;
        }
        aver = Math.pow(product, 1.0/counter);
        return aver;
    }

    @Override
    public boolean getPass() {
        if(aver>=80 && thesisLevel<='C') {
            this.setStatus(true);
            return true;
        }
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
        System.out.println("论文等级:"+getThesisLevel());
        System.out.println("颁发学位状态:"+getDegree());
    }

    @Override
    public String getDegree() {
        if(this.getPass())
            return Constants.ISSUE_MASTER_DEGREE;
        else
            return Constants.UNSATISFACTORY_ISSUE_MASTER_DEGREE;
    }
}
