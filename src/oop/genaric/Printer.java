package oop.genaric;

import oop.ploy.A;

//class parameter   /// generic
public class Printer <T extends A>{

    public void print(T anyThing){
        System.out.println(anyThing);
    }
   /* public void print1(K anyThing1){
        System.out.println(anyThing1);

    }*/
}
