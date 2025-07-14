package oop.constructor;

import java.util.Base64;
import java.util.UUID;

public class Person {
    String name;
    int age;
    String gender;
    String ID;


    public Person(){
        ID = String.valueOf((int)(Math.random() * 100000));
    }

    public Person(String name1, int age1){
        name = name1;
        age = age1;
    }

    public Person(String name1, int age1, String gender1){
        name = name1;
        age = age1;
        gender = gender1;
        ID = String.valueOf((int)(Math.random() * 100000));
        System.out.println("Hello from other side");
    }

    public Person(String name, int age, String gender, String ID ){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;

    }


    public void printPerson(){
        System.out.println("Name :" + name + " Age :" + age + " Gender :" + gender + " ID :" + ID);
    }

    public void test(){
        this.printPerson();

    }
    

    

    /*
    //اول شئ يتم استدعاؤه من الكلاس لانشاء object
    Constructor
    1. default const
    public Person(){
    }

    2. No-Argument const
    public Person(){
    }

    3. parameterized const
    public Person(String name, int age, String gender, String ID){
    }


     */


    /*static
    class calc{
    x
    y
    z

    }
    الحقول التي تريد استخدامها وقت محدد وغير مرتبطة ب object  انما مرتبطة بالclass
     */
}
