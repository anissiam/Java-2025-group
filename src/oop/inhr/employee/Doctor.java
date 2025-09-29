package oop.inhr.employee;


public class Doctor extends Person {

    /**
     * @Override annotation indicates that this method is overriding
     * the printData() method from the parent class Person.
     * This ensures the method signature matches the parent class method exactly.
     */
    @Override
    void printData() {
        System.out.println("Doctor: "+ "Name :" + name + " Age :" + age + " Id :" + id);
    }

    @Override
    void fsddsd() {

    }
}
