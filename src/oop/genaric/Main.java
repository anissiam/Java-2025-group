package oop.genaric;

import oop.intro.Calc;
import oop.ploy.A;
import oop.ploy.B;
import oop.ploy.C;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      /*  IntNum intNum = new IntNum();
        intNum.printInteger(10);


        DoubleNum doubleNum = new DoubleNum();
        doubleNum.printDouble(10.5);
*/

      /*  Printer<Integer , String> printer = new Printer<>();
        printer.print(10);
        printer.print1("");

        Printer<String , Double> printer1 = new Printer<>();
        printer1.print("fdfdsfdsfds");
        */


     /*   Printer<A> printer2 = new Printer<>();
        Printer<B> printer2 = new Printer<>();
        Printer<Calc> printer2 = new Printer<>();
        */

        print("dsadfsafd");
        print(10000);

        print("asdafdfhg");
    }

    public static <T> void print(T t){
        System.out.println(t);
    }
}
