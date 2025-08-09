package oop.inhr.superpower;

 //   Person      <--  Superpower       <--    Superman




public class SuperPower extends Person{
    String superPower;

    public void printSuperPower(){
        super.printPerson();
        System.out.println(superPower);

    }

    @Override
    public void test() {

    }
}
