package exp6;

import java.util.Calendar;
import java.util.Date;

public class StudentApplication {
    public static void main(String[] args) {
        Undergraduate undergraduate = new Undergraduate();
        undergraduate.setName("王小二");
        undergraduate.setGender('男');
        Date d = new Date(2001-1900, Calendar.JUNE,1);
        undergraduate.setBirthday(d);
        undergraduate.setSchool("上海大学");
        undergraduate.setStuId("11128981");
        undergraduate.setCategory(Constants.UNDERGRADUATE);
        double[] score={89.5, 82, 87, 73};
        undergraduate.setScore(score);
        undergraduate.setStatus(false);
        Master master=new Master();
        master.setName("李燕");
        master.setGender('女');
        Date d1 = new Date(1999-1900, Calendar.JUNE,12);
        master.setBirthday(d1);
        master.setSchool("上海大学");
        master.setStuId("10306");
        master.setCategory(Constants.MASTER);
        double[] score1 = {70, 52.5, 95, 88, 89, 91};
        master.setScore(score1);
        master.setThesisLevel('B');
        master.setStatus(false);
        StudentDegree studentDegree = new StudentDegree();
        studentDegree.issueDegree(undergraduate);
        studentDegree.issueDegree(master);
    }
}
