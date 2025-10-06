package oop.project2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Panel panel = new Panel();
        System.out.println("Welcome");
        System.out.println("Please select your option");
        System.out.println("1) Login as Admin");
        System.out.println("2) Login as Student");
        do {
            int c = scanner.nextInt();

            switch (c){
                case 1:
                    panel.loginAsAdmin();
                    break;
                case 2:
                    panel.loginAsStudent();
                    break;
            }
        }while (true);

    }
}
