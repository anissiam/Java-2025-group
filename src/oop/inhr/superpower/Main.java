package oop.inhr.superpower;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SuperPower power = new SuperPower();


        Superman superman = new Superman();
        superman.superPower = "Fly";
        superman.name = "Clark";
        superman.gender = "male";
        superman.dateOfBirth = new Date(500, 1,1,1,1);


        superman.printSuperPower();

    }
}
