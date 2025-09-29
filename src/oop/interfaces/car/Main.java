package oop.interfaces.car;

public class Main {
    public static void main(String[] args) {
        BMWDESIL bmwdesil = new BMWDESIL();
        bmwdesil.SpeedType("100km/h");
        bmwdesil.capacity();
        bmwdesil.capacity();


        BMWElec bmwElec = new BMWElec();
        bmwElec.SpeedType("100km/h");
        bmwElec.batteryNumber();
        System.out.println(bmwElec.chargingHour());


        BMWHypird bmwHypird = new BMWHypird();

        bmwHypird.SpeedType("100km/h");
        bmwHypird.batteryNumber();
        System.out.println(bmwHypird.chargingHour());

    }
}
