package oop.inhr.device;

public class Main {
    public static void main(String[] args) {

        Samsung samsung = new Samsung();
        samsung.ram = 12;
        samsung.cpu = "Core i7";
        samsung.storage =1;
        samsung.printDevice();
    }
}
