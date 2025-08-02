package oop.inhr.car;

public class Car {
    private String model;
    private int speed;

    public Car(){
    }

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void printSpeed() {
        System.out.println("Speed:" + speed + " km/hr") ;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
