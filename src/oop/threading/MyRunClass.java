package oop.threading;

import java.util.UUID;

public class MyRunClass implements Runnable {
    private String name ;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
