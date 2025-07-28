package oop.intro;

public class Shape {
    private int h;
    private int w;
    private String name;

    public Shape(int h, int w, String name) {
        this.h = h;
        this.w = w;
        this.name = name;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void area(){
        int area = h * w;
        System.out.println(area);

    }
}
