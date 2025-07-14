package oop.intro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instance // Object
  /*      Cat object1 = new Cat();  //Object
        object1.name = "locy";
        object1.age = 1;
        object1.printCat();

System.out.println("////////////////////////////");

        Cat object2 = new Cat();
        System.out.println(object2.age);
        object2.printCat();
*/

/*

        Car car1 = new Car();
        car1.color = "Black";
        car1.model = "BMW";
        car1.year = 2020;

        car1.printCar();
*/


        /*
        Class
        Student
        -name
        -mark
        -age


        printStudent()



        Object
        -student1

        -student2

         */


        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();
        calc.inputNumbers();

        System.out.println("1)Add\n2)subtract\n3)division\n4)multiple");

        int ch = scanner.nextInt();
        switch (ch){
            case 1 :
                calc.add();
                break;
            case 2 :
                calc.subtract();
                break;
            case 3 :
                System.out.println(calc.division());
                break;
            case 4:
                System.out.println(calc.multiple());
                break;
            default:
                System.out.println("Not valid ");
                break;
        }






    }


}
