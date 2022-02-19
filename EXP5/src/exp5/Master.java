package exp5;

public class Master extends Student {
    double aver;
    char thesisLevel;

    @Override
    public boolean getPass() {
        if(aver>=80 && thesisLevel<='C') {
            this.setStatus(true);
            return true;
        }
        return false;
    }

    @Override
    public double computeAverage() {
        double product = 1;
        int counter = 0;
        for(double i : score){
            product *= i;
            counter++;
        }
        aver = Math.pow(product, 1.0/counter);
        return aver;
    }

    @Override
    public String getDegree() {
        if(this.getPass())
            return Constants.ISSUE_MASTER_DEGREE;
        else
            return Constants.UNSATISFACTORY_ISSUE_MASTER_DEGREE;
    }
}
