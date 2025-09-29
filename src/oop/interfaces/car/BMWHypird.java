package oop.interfaces.car;

public class BMWHypird extends Car implements Diesel,Elec{
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

    @Override
    public int chargingHour() {
        return 3;
    }

    @Override
    public void batteryNumber() {
        System.out.println(5);
    }
}
