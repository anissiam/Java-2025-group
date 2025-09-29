package oop.interfaces.car;

public class BMWDESIL extends Car implements Diesel{
    @Override
    public void SpeedType(String type) {
        System.out.println(type);
    }

    @Override
    public void DieselType() {
        System.out.println("Diesel");
    }

    @Override
    public void capacity() {
        System.out.println("100L");

    }
}
