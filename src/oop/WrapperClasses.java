package oop;

public class WrapperClasses {
    public static void main(String[] args) {
        int x = 10;  //primitive

        System.out.println(x);

        Integer y = 10;//non-primitive  // object
        //System.out.println(Integer.MAX_VALUE);

       // Integer ss = new Integer("1000000");  //Sting --> Integer

        Integer sss = Integer.valueOf("1000000");  //object --> Integer
        System.out.println(sss + 100451650);
        System.out.println(sss.doubleValue());

        int sssss = Integer.parseInt("10000000");  // primitive -> int




    }

}
