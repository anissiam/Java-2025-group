package oop;

import oop.intro.Car;

public class Exceptions {
    static Car car;
    public static void main(String[] args) {

        int arr[] = new int[5];


    //    arr[6] = 10;
      //  car.printCar();


      //  System.out.println(50 / 0);

       /* if (car!=null){
            car.printCar();
        }*/


        try {
           /* arr[6] = 10;
           System.out.println(50 / 0); //arithmetic exception
            car.printCar(); //throw -> exception  //null pointer exception*/

        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("last index in array 4");
        }finally {
            System.out.println("finally block");
        }

        System.out.println("end of main");

    }
}
