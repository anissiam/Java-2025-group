package oop.inhr.superpower;

import java.util.Date;

/**
 * Base Person class that can be extended by other classes
 * demonstrating IS-A relationship (e.g., Student IS-A Person)
 */
/*
 * IS-A Relationship in Java:
 * - Represents inheritance relationship between classes
 * - Child class IS-A type of Parent class
 * - Example: Car IS-A Vehicle, Student IS-A Person
 * - Implemented using 'extends' keyword
 * - Allows child to inherit parent's properties and methods
 *
 * In this example:
 * - Person is the parent/base class
 * - Employee is the child class that extends Person
 */




//Generalization

public abstract class Person {
    String name ; 
    Date dateOfBirth;
    String gender;

    public abstract void test();
    public void printPerson(){
        System.out.println(name + " " + dateOfBirth + " " + gender);
    }

}


