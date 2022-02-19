package exp6;

public class StudentDegree {
    public void issueDegree(Manageable manage){
        try {
            double ave = manage.computeAverage();
            manage.printInfo();
            System.out.println("平时成绩："+ ave);
        }
        catch(UndergraduateException e){
            System.out.println("出现如下问题：");
            System.out.println(e.warnMess());
        }
        catch(MasterException e){
            System.out.println("出现如下问题：");
            System.out.println(e.warnMess());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
