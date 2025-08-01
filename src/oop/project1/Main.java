package oop.project1;


import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Student[] studentArray = new Student[3];  //array of objects

        studentArray[0] = new Student("Anis", 32, "Male", "cs", 60);
        studentArray[1] = new Student("Sali", 20, "Female", "Ai", 90);
        studentArray[2] = new Student("Yaha", 40, "Male", "IT", 70);


        int c;
        do {
            System.out.println("1)Add Student\n2)Remove Student\n3)Update Student\n4)Print Students\n5)Max Mark\n6)Exit\n");
            c = scanner.nextInt();
            switch (c) {
                case 1:
                    addStudent(studentArray);
                    break;
                case 2:
                    removeStudent(studentArray);

                    break;
                case 3:
                    break;
                case 4:
                    printStudents(studentArray);
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not valid");
                    break;
            }
        } while (c != 5 && c != 6);


        //  studentArray[0]; // objects are created dynamically type (Student)


        for (int i = 0; i < studentArray.length; i++) {
            System.out.println(studentArray[i]);

        }

    }

    private static void addStudent(Student[] studentArray) {
        for (int i = 0; i < studentArray.length; i++) {
            scanner.nextLine();
            studentArray[i] = new Student();

            System.out.println("Enter student name");
            String name = scanner.nextLine();
            studentArray[i].setName(name);

            System.out.println("Enter student age");
            int age = scanner.nextInt();
            studentArray[i].setAge(age);
            scanner.nextLine();
            System.out.println("Enter Student gender");
            char g = scanner.nextLine().charAt(0);
            studentArray[i].setGender(g);


            System.out.println("Enter Student major");
            String major = scanner.nextLine();
            studentArray[i].setMajor(major);

            System.out.println("Enter Student grade");
            int grade = scanner.nextInt();
            studentArray[i].setGrade(grade);
        }
    }

    private static void printStudents(Student[] studentArray) {
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i] == null){
                System.out.println(studentArray[i]);
            }
        }
    }

    private static void removeStudent(Student[] studentArray){
        scanner.nextLine();
        System.out.println("plz enter the name you want ot remove ");
        String name = scanner.nextLine();

        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i].getName().equalsIgnoreCase(name)){
                studentArray[i] = null;
                System.out.println("Removed");
            }
        }

    }

    private static void updateStudent(Student[] studentArray){

    }

}
