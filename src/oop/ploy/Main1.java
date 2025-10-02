package oop.ploy;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void sound(int s) {

    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow Meow ");
    }
}

public class Main1 {
    public static void main(String[] args) {

        Animal a1 = new Dog();   // Reference نوعه Animal لكن الكائن Dog
        Animal a2 = new Cat();   // Reference نوعه Animal لكن الكائن Cat

        a1.sound();  // Dog barks
        a2.sound();  // Cat meows
    }

}

