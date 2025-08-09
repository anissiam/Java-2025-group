package oop.interfaces.computer;

import java.util.Arrays;

public class Computer implements Device {
    private String model;
    private int ram;
    private int storage;
    private String[] RGB;
    public Computer() {
    }


    public Computer(String model, int ram, int storage, String[] RGB) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.RGB = RGB;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }


    @Override
    public void start() {
        System.out.println("Computer started");
    }

    @Override
    public void shutdown() {
        System.out.println("Computer shutdown");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", RGB=" + Arrays.toString(RGB) +
                '}';
    }
}
