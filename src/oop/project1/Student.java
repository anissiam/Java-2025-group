package oop.project1;

public class Student extends Person{
   private String major;
   private int grade;

    public Student() {
    }

    public Student(String major, int grade) {
        this.major = major;
        this.grade = grade;
    }

    public Student(String name, int age, String gender, String major, int grade) {
        super(name, age, gender);
        this.major = major;
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString()+" Student{" +
                "major='" + major + '\'' +
                ", grade=" + grade +
                '}';
    }
}
