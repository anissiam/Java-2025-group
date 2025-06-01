import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



       /* System.out.println("Plz enter the line");
        String line = scanner.nextLine();

        if (line.isEmpty()){
            System.out.println("Empty line");
            return;
        }


        if (line.contains("@")){
            System.out.println("Email");

        } else if(line.contains(":")) {
            System.out.println("URL");
        }else {
            System.out.println("Not Email or URL");
        }*/


     /*   int x = 3;
        if (x > 0) {
            System.out.println("x is greater than 0");
        }else {
            System.out.println ("x is less than or equal 0 ");
        }
*/
       /* System.out.println("num:");
        int num = scanner.nextInt();*/
/*


        if (num==1){
            System.out.println(" 1 ");
        }else if(num == 2 || num ==3){
            System.out.println("2 or 3");
        }else {
            System.out.println("grater than 3");
        }
*/




      /*  switch (num){
            case 1:System.out.println("you enter 1");
                break;
            case 2:
            case 3:  System.out.println("2 or 3");
                break;
            default:
                System.out.println("grater than 3");
                break;

        }
*/
      /*  System.out.println("Enter num of month:");
        int m = scanner.nextInt();

        switch (m){
            case 1:
                System.out.println("Jan  كانون الثاني");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 2:
                System.out.println("Feb شباط");
                break;

        }*/


        /*System.out.println("Mark:");
        int mark = scanner.nextInt();


        switch (mark) {
            case 90:
                System.out.println("E");
                break;
            case 80:
                System.out.println("Good");
                break;
            case 50:
                System.out.println("Pass");
                break;
            default:
                System.out.println("Failed");
                break;
        }*/

       /* System.out.println("num:");
        int num = scanner.nextInt();

        switch (num){
            case 1:System.out.println("you enter 1");
            break;
            case 2:System.out.println("you enter 2");
                break;
            case 3:System.out.println("you enter 3");
                break;
            default:
                System.out.println("grater than 3");
                break;

        }*/


      /*  if (num==1){
            System.out.println("1");
        } else if (num==2) {
            System.out.println("2");
        } else if (num==3) {
            System.out.println("3");
        } else {
            System.out.println("grater than 3");
        }*/


       /* System.out.println("Enter your age:");

        int age = scanner.nextByte();

        if (age>=19){
            System.out.println("Plz enter your wieght:");
            double w = scanner.nextDouble();
            if (w>90){
                System.out.println("not valid");
            }else {
                System.out.println("plz enter your tall");
                double tall = scanner.nextDouble();
                if (tall>=165){
                    scanner.nextLine();
                    System.out.println("Plz enter your name");
                    String name = scanner.nextLine();
                    System.out.println(name+ " Can enter the army");
                }
            }
        }
*/

       /* System.out.println("Mark");
        int x = scanner.nextInt();

        if (x>0){
            System.out.println("+");
        } else if (x<0) {
            System.out.println("-");
        } else {
            System.out.println("0");

        }
*/


        /*System.out.println("Plz enter the line ");

        String line = scanner.nextLine();

        if (line.isEmpty()){
            System.out.println("Line is empty");
            return;
        }

        if (line.contains("java")){
            System.out.println("Contains java");
        }*/


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


     /*   System.out.println("Plz enter the num");

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
*/

        /*if (num!=0){  // != not equal  == equal
            if (num % 2 == 0) {
                System.out.println("Even");
            }else {
                System.out.println("Odd");

            }

        }else {
            System.out.println(" zero not even nor or");
        }*/


       /* System.out.println("Plz enter the mark");
        int mark = scanner.nextInt();



        if (mark >100 || mark<0 ) {
            System.out.println("Not valid");
            return;  // stop
        }

        if (mark >= 90) {
            System.out.println("E");
            // T && T
        } else if (mark >= 80 && mark < 90) {
            System.out.println("vary good");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("good");
        } else if (mark >= 50 && mark < 70) {
            System.out.println("not bad");
        } else {
            System.out.println("Failed");

        }
*/







        /*if (mark >100 || mark<0 ) {
            System.out.println("Not valid");
        }else {
            if (mark >= 90) {
                System.out.println("E");
                // T && T
            } else if (mark >= 80 && mark < 90) {
                System.out.println("vary good");
            } else if (mark >= 70 && mark < 80) {
                System.out.println("good");
            } else if (mark >= 50 && mark < 70) {
                System.out.println("not bad");
            } else {
                System.out.println("Failed");

            }
        }
*/

        // truth table  && || !

        /* AND &&
        T    T     T
        T    F     F
        F    T     F
        F    F     F



        OR ||

        T    T     T
        T    F     T
        F    T     T
        F    F     F


        NOT !

        T   F
        F   T

         */


    }
}
