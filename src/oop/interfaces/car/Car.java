package oop.interfaces.car;

public abstract class Car {
    private String model;
    private short year;
    private String color;
    private int maxSpeed;

    public Car() {
    }

    public Car(String model, short year, String color, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void SpeedType(String type);

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
