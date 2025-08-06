package oop.abstraction;

public abstract class Computer {
    private String name;
    private int ram;
    private int storage;
    private String cpu;
    private String gpu;


    public Computer(String name, int ram, int storage, String cpu, String gpu) {
        this.name = name;
        this.ram = ram;
        this.storage = storage;
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }


    public abstract void addRGB() ;

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
