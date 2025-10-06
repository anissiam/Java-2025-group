package oop.project2;

import java.util.ArrayList;

public class Admin extends User {
    public Admin() {
    }

    public Admin(int id, String name, String email, String password) {
        super(id, name, email, password);
    }


    public static ArrayList<Admin> getAllAdmins() {
        ArrayList<Admin> admins = new ArrayList<>();
        admins.add(new Admin(1, "anis", "<EMAIL>", "123"));
        admins.add(new Admin(2, "Sami", "<EMAIL>", "123"));
        admins.add(new Admin(3, "Ali", "<EMAIL>", "123"));
        admins.add(new Admin(4, "Sara", "<EMAIL>", "123"));
        admins.add(new Admin(5, "Adam", "<EMAIL>", "123"));
        admins.add(new Admin(6, "Sally", "<EMAIL>", "123"));
        return admins;
    }

    @Override
    public void showMenu() {
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Update Student Info");
        System.out.println("4. View All Students");
        System.out.println("5. View Courses");
        System.out.println("6. Add Course");
        System.out.println("7. Exit");

    }

}
