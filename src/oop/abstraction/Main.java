package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        /*Circle circle = new Circle();
        circle.area();*/


      /*  Employee employee = new Employee();
        employee.salary = 200;
        employee.convertSalary();*/

        MSI msi = new MSI("MSI", 12, 521, "Core i5", "Nvidia");
        msi.addRGB();
        System.out.println(msi);
    }
}
