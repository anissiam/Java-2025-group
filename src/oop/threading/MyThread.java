package oop.threading;

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
