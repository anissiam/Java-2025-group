package oop.project2;

import java.util.ArrayList;

public class Course {
    private int courseId;
    private String courseName;

    public Course() {
    }

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public static ArrayList<Course> getAllCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course(1, "Java"));
        courses.add(new Course(2, "C++"));
        courses.add(new Course(3, "Kotlin"));
        courses.add(new Course(4, "Laravel"));
        courses.add(new Course(5, "Node Js"));

        return courses;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
