package exp5;

import exp5.Student;

public class StudentDegree {

    public void printStudentInfo(Student student){
        System.out.println("姓名："+student.getName());
        System.out.println("性别："+student.getGender());
        System.out.printf("出生日期：%tF%n",student.getBirthday());
        System.out.println("学校："+student.getSchool());
        System.out.println("学号："+student.getStuId());
        System.out.println("学生类别："+student.getCategory());
        System.out.println("平均成绩："+student.computeAverage());
    }

    public void issueDegree(Student student){
        System.out.println(student.getDegree());
    }
}
