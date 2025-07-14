package oop.intro;

import java.util.Scanner;

public class Calc {

    int num1 ;
    int num2;

    public void add(){
        System.out.println(num1 + num2);
    }

    public void subtract() {
        System.out.println(num1 - num2);
    }

    public double division() {
        return (double) num1 / num2;
    }

    public double multiple(){
        return num1 * num2;
    }

    public void inputNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter the num 1");
        num1 = scanner.nextInt();

        System.out.println("Plz enter the num 2");
        num2 = scanner.nextInt();
    }
}
