package oop.inhr.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("2019", 200);

        System.out.println(car.toString());

        System.out.println("//////////////////////////////////////");

        BMW bmw = new BMW("BMW", 900);

        System.out.println(bmw.toString());

    }
}
