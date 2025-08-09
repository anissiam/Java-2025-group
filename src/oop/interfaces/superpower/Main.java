package oop.interfaces.superpower;

public class Main {
    public static void main(String[] args) {
        IconMan iconMan = new IconMan();
        iconMan.mySuperPower();
        System.out.println(iconMan.getPower());


        SuperMan superMan = new SuperMan();
        superMan.mySuperPower();
        System.out.println(superMan.getPower());
    }
}
