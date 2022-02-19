package exp5;
import exp5.Constants;
import exp5.Student;

public class Undergraduate extends Student {
    double aver;

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
    public double computeAverage() {
        double sum = 0;
        int counter = 0;
        for(double i : score){
            sum += i;
            counter++;
        }
        aver = sum/counter;
        return aver;
    }

    @Override
    public String getDegree() {
        if(this.getPass())
            return Constants.ISSUE_UNDERGRADUATE_DEGREE;
        else
            return Constants.UNSATISFACTORY_ISSUE_UNDERGRADUATE_DEGREE;
    }
}
