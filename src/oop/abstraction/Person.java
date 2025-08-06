package oop.abstraction;


//concreate class
// Abstraction class - A class that is declared abstract using 'abstract' keyword
// Concrete class - A regular class that implements all its abstract methods from parent

public abstract class Person {
    private static final int MIN_AGE = 18;
    private  int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void psadsad(){

    }

    public abstract void printPerson();

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
