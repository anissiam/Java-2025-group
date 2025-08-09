package oop.interfaces.computer;

public class Samsung extends Computer implements Enhance2{
    @Override
    public boolean screenTouch() {
        return false;
    }

    @Override
    public String[] getRGB() {
        return new String[0];
    }

    @Override
    public void setRGB(String[] RGB) {

    }
}
