package oop.abstraction;

public class MSI extends Computer{

    public MSI(String name, int ram, int storage, String cpu, String gpu) {
        super(name, ram, storage, cpu, gpu);
    }

    @Override
    public void addRGB() {
        System.out.println("RED Yellow");
    }
}
