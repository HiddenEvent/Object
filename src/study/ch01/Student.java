package study.ch01;

public class Student {
    int studentNumber;
    String studentName;
    int majorCode;
    String majorName;
    int grade;

    public void showStudentInfo(){
        System.out.println(studentNumber + "학번 학생의 이름 "+ studentName);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
