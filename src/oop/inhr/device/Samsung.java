package oop.inhr.device;

public class Samsung  extends Device {

    /**
     * Prints the device specifications including RAM, storage, and CPU.
     * This method overrides the parent class implementation.
     */
    @Override
    public void printDevice() {
        System.out.println(super.toString());

       //System.out.println("Helloooooooooooo");
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
