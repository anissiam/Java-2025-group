package oop.interfaces.superpower;

public class SuperMan extends Person implements SuperPower , Employee{

    @Override
    public void mySuperPower() {
        System.out.println("Fly");
    }

    @Override
    public int getPower() {
        return 500;
    }

    @Override
    public void work() {

    }

    @Override
    public void paySalary() {

    }
}
