package oop.interfaces.computer;

public class HP extends Computer implements Enhance1 {
   private String[] colors ;

    @Override
    public void start() {
        System.out.println("HP start");
    }
    @Override
    public void shutdown() {
        System.out.println("HP shutdown");
    }


    @Override
    public String[] getRGB() {
        return colors;
    }

    @Override
    public void setRGB(String[] RGB) {
        System.out.println("HP setRGB");
        colors = RGB;

    }


}
