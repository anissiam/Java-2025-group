package oop.threading;

public class Main {
    public static void main(String[] args) {
        //main thread
        MyRunClass myRunClass = new MyRunClass();
        myRunClass.setName("Thread - 0");
        Thread thread = new Thread(myRunClass);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        MyThread myThread0 = new MyThread();
        myThread0.start();


        MyRunClass myRunClass1 = new MyRunClass();
        myRunClass1.setName("Thread - 1");
        Thread thread1 = new Thread(myRunClass1);
        thread1.start();







/*
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();


        MyThread myThread0 = new MyThread();
        myThread0.start();
       *//* try {
            myThread0.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
*//*
        MyThread myThread1 = new MyThread();
        myThread1.start();*/
    }
}
