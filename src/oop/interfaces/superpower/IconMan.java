package oop.interfaces.superpower;

public class IconMan extends Person implements SuperPower{

    @Override
    public void mySuperPower() {
        System.out.println("Smart");
    }

    @Override
    public int getPower() {
        return 200;
    }
}
