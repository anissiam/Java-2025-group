package oop.abstraction;

public class Rectangle extends Shape{
    int length = 10;
    int width = 5;
    @Override
    public void area() {
        int area = length * width;
        System.out.println(area);
    }


    @Override
    public double perimeter() {
        return 0;
    }
}
