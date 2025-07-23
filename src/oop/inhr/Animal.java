package oop.inhr;

/*
Object
 */
//Super class /parent class //base class// general class
public class Animal {
    private String name;
    private int age;
    String sound ;
    public Animal() {
       // System.out.println("Animal constructor");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void makeSound() {
        System.out.println("Animal sound " + sound);
    }

    public void printAnimal() {
        Utils.printLog(getClass().getName());
        System.out.println("Name :" + name + " Age :" + age);
    }



}
