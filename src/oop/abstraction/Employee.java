package oop.abstraction;

public class Employee extends Person{
    double salary;

    @Override
    public void printPerson() {
        System.out.println("Employee" + salary);
    }

    public void convertSalary(){
        double s = salary * 3.37;
        System.out.println(s);


    }
}
