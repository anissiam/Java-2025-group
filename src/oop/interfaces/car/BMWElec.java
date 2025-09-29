package oop.interfaces.car;

public class BMWElec extends Car implements Elec{
    @Override
    public int chargingHour() {
        return 4;
    }

    @Override
    public void batteryNumber() {
        System.out.println("8");
    }

    @Override
    public void SpeedType(String type) {
        System.out.println(type);
    }
}
