package oop.project2;

import java.util.ArrayList;
import java.util.Scanner;

public class Panel {
    Scanner scanner = new Scanner(System.in);

    private ArrayList<Admin> admins = Admin.getAllAdmins();
    private ArrayList<Student> students = Student.getAllStudents();
    private ArrayList<Course> courses = Course.getAllCourses();


    public void loginAsAdmin() {
        //scanner.nextLine();
        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        System.out.println("Please enter your password");
        String password = scanner.nextLine();

        for (Admin admin : admins) {
            if (admin.name.equalsIgnoreCase(name) && admin.password.equals(password)) {
                System.out.println("Welcome " + name);
                admin.showMenu();
                showMenuAdmin();
                break;

            }
        }
    }

    public void loginAsStudent() {
        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        System.out.println("Please enter your password");
        String password = scanner.nextLine();

        for (Student student : students) {
            if (student.name.equalsIgnoreCase(name) && student.password.equals(password)) {
                System.out.println("Welcome " + name);
                showMenuStudent(student);
                break;
            }
        }
    }

    private void showMenuStudent(Student student) {
        student.showMenu();
        /*System.out.println("1. View My Info");
        System.out.println("2. View My Courses");
        System.out.println("3. Add Course to My List");*/

        int c = scanner.nextInt();
        do {
            switch (c) {
                case 1:
                    System.out.println(student);
                    break;
                case 2:
                    viewStudentCourses(student);
                    break;
                case 3:
                    addCourseToMyList(student);
                    break;
                default:
                    break;
            }
        } while (c >= 6);


    }

    private void addCourseToMyList(Student student) {
        viewAllCourses();

        System.out.println("Choose the course id");
        int id = scanner.nextInt();
        for (Course course : courses) {
            if (course.getCourseId() == id) {
                student.addCourseToStudent(course);
                System.out.println("Added");
                showMenuStudent(student);

                break;
            }
        }
    }


    private void viewStudentCourses(Student student) {
        ArrayList<Course> studentCourses = student.getAllCourses();

        for (Course course : studentCourses) {
            System.out.println(course);
        }

        /*
        empty -> list courses - > add course
        not empty -> list courses of student - > remove course
         */
        if (studentCourses.isEmpty()) {
            viewAllCourses();

            System.out.println("Choose the course id");
            int id = scanner.nextInt();
            for (Course course : courses) {
                if (course.getCourseId() == id) {
                    studentCourses.add(course);
                    student.addCourseToStudent(course);
                    System.out.println("Added");
                    showMenuStudent(student);

                    break;
                }
            }
        } else {
            System.out.println("Choose the course id");
            int id = scanner.nextInt();
            for (Course course : studentCourses) {
                if (course.getCourseId() == id) {
                    studentCourses.remove(course);
                    break;
                }
            }
        }


    }


    /// ////////////////////////////////////////////////////////////////////////////////
    private void showMenuAdmin() {
        int c = scanner.nextInt();
        do {
            switch (c) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    updateStudent();
                case 4:
                    viewAllStudent();
                    break;
                case 5:
                    viewAllCourses();
                    break;
                case 6:
                    createCourse();
                    break;
                default:
                    break;
            }
        } while (c >= 6);
    }

    private void createCourse() {
        System.out.println("Plz enter the id");
        int id = scanner.nextInt();
        for (Course course : courses) {
            if (course.getCourseId() == id) {
                System.out.println("Choose other id ");
                id = scanner.nextInt();
                break;
            }
        }

        scanner.nextLine();

        System.out.println("Plz enter course name");
        String name = scanner.nextLine();

        Course course = new Course(id, name);
        courses.add(course);
        System.out.println("Course added");

    }

    private void viewAllCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    private void updateStudent() {
        Student existStudent = new Student();
        boolean exist = false;
        System.out.println("Plz enter the id");
        int id = scanner.nextInt();
        for (Student student : students) {
            if (student.id == id) {
                existStudent = student;
                exist = true;
                break;
            }
        }

        if (!exist) {
            System.out.println("Student not found");
            return;
        }


        scanner.nextLine();
        System.out.println("Update 1)Name\n2)Email");
        int c = scanner.nextInt();

        switch (c) {
            case 1:
                updateName(existStudent);
                break;
            case 2:
                updateEmail(existStudent);
                break;
            default:
                break;

        }


    }

    private void updateEmail(Student student) {
        System.out.println("Plz enter the new email");
        String newEmail = scanner.nextLine();
        student.email = newEmail;
        System.out.println("Updated");


    }

    private void updateName(Student student) {
        System.out.println("Plz enter the new name");
        String newName = scanner.nextLine();
        student.name = newName;
        System.out.println("Updated");


    }

    private void addStudent() {
        System.out.println("Plz enter the id");
        int id = scanner.nextInt();
        for (Student student : students) {
            if (student.id == id) {
                System.out.println("Choose other id ");
                id = scanner.nextInt();
                break;
            }
        }
        scanner.nextLine();

        System.out.println("Plz enter the name");
        String name = scanner.nextLine();

        System.out.println("Plz enter the email");
        String email = scanner.nextLine();

        System.out.println("Plz enter the password");
        String password = scanner.nextLine();

        students.add(new Student(id, name, email, password));

        System.out.println("Student added");


    }


    private void removeStudent() {
        System.out.println("Plz enter the id");
        int id = scanner.nextInt();
        boolean found = false;

        for (Student student : students) {
            if (student.id == id) {
                students.remove(student);
                System.out.println("Student removed");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    }

    private void viewAllStudent() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
