package oop.inhr.car;

public class BMW extends Car{
    private String name;
    @Override
    public void printSpeed() {
        System.out.println("Speed:" + getSpeed() + " mile/hr") ;
    }

    public BMW(){

    }

    public BMW(String model , int speed){
        super(model, speed);
    }
}
