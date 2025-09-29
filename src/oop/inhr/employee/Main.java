package oop.inhr.employee;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();

        doctor.name = "Anis";
        doctor.id = "123456789";
        doctor.age = 25;
        doctor.printData();


        Techer techer = new Techer();
        techer.name = "Mosa";
        techer.id = "987654321";
        techer.age = 20;

        techer.printData();
    }
}
