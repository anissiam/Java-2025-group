import javax.swing.*;
import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {


        //input

        /*
        1. tools   -> Scanner
        2. line
        3. var
         */

         /*
         Package  //import

         1. Core
            //lang , swing , date  , util,
         2.Extended
            //java fx
          */


        Scanner scanner = new Scanner(System.in);  // object  //

       /* System.out.println("Please enter the num :");


        int number = input.nextInt(); //int

        System.out.println("The number is : " + number);*/


       /* System.out.println("Plz enter the num1");
        int x = scanner.nextInt();

        System.out.println("Plz enter the num2");
        int y = scanner.nextInt();

        int ava = (x + y) / 2;
        System.out.println("the ava = " + ava);
*/
        System.out.println("Plz enter your name");
        String name = scanner.nextLine();

        System.out.println("Plz enter your age ");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Plz enter your major");
        String major = scanner.nextLine();


        System.out.println("your name is " + name + " your age is " + age +
                " and study " + major);


        JOptionPane.showMessageDialog(null , "your name is " + name + " your age is " + age +
                " and study " + major);













    }
}
