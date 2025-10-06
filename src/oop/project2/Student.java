package oop.project2;

import oop.ploy.A;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private ArrayList<Course> enrolledCourses = new ArrayList<>();

    public Student() {
    }
    public Student(ArrayList<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public Student(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public void showMenu() {
        System.out.println("1. View My Info");
        System.out.println("2. View My Courses");
        System.out.println("3. Add Course to My List");

    }

    public static ArrayList<Student> getAllStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Tasnim", "<EMAIL>", "321"));
        students.add(new Student(2, "Nena", "<EMAIL>", "321"));
        students.add(new Student(3, "Mosa", "<EMAIL>", "321"));
        students.add(new Student(4, "Mona", "<EMAIL>", "321"));
        students.add(new Student(5, "Walaa", "<EMAIL>", "321"));
        return students;
    }

    public void addCourseToStudent(Course course){
        enrolledCourses.add(course);
    }

    public ArrayList<Course> getAllCourses() {
        return enrolledCourses;
    }

}
