package oop.files;

import java.io.Serializable;

public class Person implements Serializable {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", ID='" + ID + '\'' +
                '}';
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
