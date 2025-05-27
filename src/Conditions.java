import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  System.out.println("anis".equals("anis"));

        /*
        if(condition){
        //statment
        }
         */


     /*   int x = 2;
            // t
        if(x>5){
            System.out.println("Bigger than 5 ");
        }*/

/*

        System.out.println("Plz enter the mark");
        int mark = scanner.nextInt();
*/

       /* if(mark>=50){
            System.out.println("Pass");
        }else {
            System.out.println("Lose");
        }*/

       /* if(mark<50){
            System.out.println("Lose");
        }*/

        /*if (mark>100 ||mark<0){
            System.out.println("not valid");
        }else {
            if(mark>=50){
                System.out.println("Pass");
            }else {
                System.out.println("Lose");
            }
        }*/


        System.out.println("Plz enter the num");

        int num = scanner.nextInt();

        if (num==0){  // != not equal  == equal
            System.out.println(" zero not even nor or");

        }else {
            if (num % 2 == 0) {
                System.out.println("Even");
            }else {
                System.out.println("Odd");

            }
        }


        /*if (num!=0){  // != not equal  == equal
            if (num % 2 == 0) {
                System.out.println("Even");
            }else {
                System.out.println("Odd");

            }

        }else {
            System.out.println(" zero not even nor or");
        }*/







    }
}
