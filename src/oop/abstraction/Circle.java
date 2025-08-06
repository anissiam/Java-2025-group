package oop.abstraction;

//Override   /// implement
public class Circle extends Shape{
    int radius = 10;

    @Override
    public void area() {
        double area = radius * radius * Math.PI;
        System.out.println(area);
    }

    @Override
    public double perimeter() {
        return 0;
    }


}
