package oop.constructor;

import oop.encp.Bank;

public class Main {
    public static void main(String[] args) {

        /*
        person1 (Memory Address: 0x1234)  instance of Person class
        this
        +-------------------+
        | name: "Anis"     |
        | age: 25          |
        | gender: "Male"   |
        | ID: "123456789"  |
        +-------------------+
        */
        Person person1 = new Person();
        person1.name = "Anis";
        person1.age = 25;
        person1.gender = "Male";
        person1.printPerson();


       System.out.println("/////////////////////////////////////////////");

        /*
        person2 (Memory Address: 0x1234)  instance of Person class
        this
        +-------------------+
        | name: "Sami"     |
        | age: 20          |
        | gender: "Female" |
        | ID: "987654321"  |
        +-------------------+
        */

        Person person2 = new Person();
        person2.name = "Sami";
        person2.age = 20;
        person2.gender = "Female";
        person2.printPerson();
        System.out.println("/////////////////////////////////////////////");

        //

        Person person3 = new Person("Nena", 18);
        person3.printPerson();

        System.out.println("/////////////////////////////////////////////");

        /*
        person4 (Memory Address: 0x1234)  instance of Person class
        this
        +-------------------+
        | name: "Mosa"     |
        | age:   18        |
        | gender: "male"   |
        | ID: "131213212"  |
        +-------------------+
        */

        Person person4 = new Person("Mosa", 18, "male");
        person4.printPerson();


        System.out.println("/////////////////////////////////////////////");

          /*
        person5 (Memory Address: 0x1234)  instance of Person class
        this
        +-------------------+
        | name: "Ali"     |
        | age:   50        |
        | gender: "male"   |
        | ID: "131213212"  |
        +-------------------+
        */
        Person person5 = new Person("ALi", 50, "male", "131213212");
        person5.printPerson();


        System.out.println("/////////////////////////////////////////////");


        /*System.out.println(Test.encodePassword("123"));


        System.out.println(CalcCircle.calcArea(10));
        System.out.println(CalcCircle.PI);*/


        Shape shape = new Shape();

    }

}






