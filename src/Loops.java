import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*loop

        1. index ( var )
        2. Tools (while , do-while, for)
        3. condition
        4. inc , dec


        while

        int i= 0;
        while(//cond.){
            //statment
            //i++
        }

         */

        //1,2,3,4,5

        /*int i = 1;

        while (i <= 100) {
            System.out.println("i = " + i);
            i++; //i = i+1
        }*/


        //RAM i:1 , 2 , 3 ,4 , 5 , 6
        //Console:1 2,3 , 4 ,5


       /* int i = 0;

        while (i < 100) {
            System.out.println("i = " +(i+1));
            i++; //i = i+1
        }
*/


        /*int i = 0;
        while (i <= 10) {
            i++; //i = i+1
            if (i%2==0){
                System.out.println(i + " Even");
            }
        }*/

        //RAM i :0 , 1 , 2
        //Console : 2 Even




      /*  int i = 0;
        while (i < 10) {
            i += 2; // i = i+2
            System.out.println(i + " is even");
        }*/

        //RAM i : 0 ,2 , 4
        //Console: 0 is even  , 2 is even  , 4 is even



        /*
        hello  0
        hello  1
        hello  2
        hello  3
        hello  4
         */

        /*int i = 0;
        while (i<=4){
            System.out.println("Hello");
            i++;
        }*/


       /* int i = 0;
        while (i<10){
            if (i%2!=0){
                System.out.println(i + " Odd ");
            }
            i++;
        }


*/

       /* int i = 1;
        while (i < 10) {
            System.out.println(i + " Odd ");
            i += 2;
        }*/



       /* int i = 0;
        int sum = 0;
        while (i<=5){
            sum += i; // sum = sum +i

            i++; //i = i+1
        }

        System.out.println("Sum = " + sum);*/


        //RAM i:0 , 1 , 2 , 3 , 4 , 5 , 6
         // sum:0 , 1 , 3 , 6 , 10 , 15
        //Console:


      /*  System.out.println("Plz enter the word");
        String st = scanner.nextLine();

        while (true){
            if (st.equalsIgnoreCase("stop")){
                System.out.println("App is stopped");
                break;
            }
            System.out.println("Plz enter new word");
            st = scanner.nextLine();
        }*/

       /* int i = 0;
        while (i<=5){
            System.out.println(i);
            if (i == 3) {
                break;
            }
            i++;
        }*/



        /*int i = 0;
        while (i<=5){
            i++;
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }*/

        //7*6*5*4*3*2*1  7!

        /*int i = 7;
        int fact = 1;
        while (i>=1){
            fact *= i;
            i--;
        }
        System.out.println(fact);*/


       /* while (true){

            System.out.println("Enter the mark");
            int mark = scanner.nextInt();
            if (mark<0 || mark>100){
                System.out.println("not valid");
                continue;
            }

            *//*System.out.println("Valid");
            System.out.println("Enter new mark");
            mark = scanner.nextInt();*//*

        }
*/
        /*int i = 5;

        while (i!=5){
            System.out.println("Hello");
            i++;
        }*/
       /* int i = 5;
        do {
            System.out.println("Hello");
        } while (i != 5);*/

       /* int sum = 0;
        for(int i=0 ; i<5 ; i++ ){
            sum += i;
        }
        System.out.println(sum);*/
/*
        int i = 0;
        for (;;) {

            if ( i >= 5){
                break;
            }
            System.out.println("Hello");
            i++;
        }*/
                        //5
            //  1        2       4
        /*for (int i = 0; i < 10; i+=2) {
            //3

                System.out.println(i+ " Even");


        }*/



        //RAM i: 0 ,2 , 4 ,6, 8 ,10
        //Console:0 Even 2 Even 4 Even 6 even 8 even



       /* System.out.println("Plz enter the year");
        String line = scanner.nextLine();


        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
*/

      /*  // 50 , 90 , 80 , 10 , 30

        int max = 0;
        int min = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.println("Plz enter the num");
            int num = scanner.nextInt();

            if (i==0){
                min = num;
            }

            if (max<num){
                max = num;
            }

            if (min>num){
                min = num;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);*/


        //RAM :
        //  i:0 ,1 , 2 , 3 , 4
        //max:0 , 50 , 90
        //num:50 , 90 , 80 , 10 ,30
        //min:50 , 10
        //Console:

        //if
      /*          max = num
      0<50 true > max = 50
      50<90 t   > max = 90
      90<80 F   >
      90<10 F   >
      90<30 F   >


                 min = num
       50>50   F
       50>90   F
       50>80   F
       50>10   T> min = 10
       10>30   F>
       */




        /*
        i * 5
        1*5 = 5
        2*5 = 10
        3*5= 15
        .
        .
        .
        10*5 = 50
         */


        /*for (int i = 1; i <= 10; i++) {
            System.out.println(i + "* 5 =" + ( i * 5));
        }*/


        /*
        4 * 7

        Week 1       i 1->4
        Day 1 , Day 2 , ... Day 7  j 1 ->7

        Week 2
        Day 1  , Day 2 , ... Day 7

        Week 3
        Day 1 , Day 2 , ... Day 7

        Week 4
        Day 1  , Day 2 , ... Day 7

         */


        /*
        i =0  (j<7)
        i= 1
         */


       /* for (int i = 0; i < 4; i++) {
            System.out.println("Week " + (i + 1));
            for (int j = 0; j < 7; j++) {
                System.out.print("Day" + (j+1) + "   ");
            }
            System.out.println();
        }*/
        /*
        RAM :
        i : 0 1
        j : 0

        Console: 0 0  0 1
         */



        //*****
        //*****
        //*****

        /*for (int i = 0; i < 3; i++) { //row
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


       /**


        *   row = 5 => * , ** , *** , **** , *****
        *   i = 0 , j = 0 => *(j=i)
        *   i = 1 , j = 0  , 1=    * *(j<i)
        *   i = 2 , j= 0
        *
        **
        ***
        ****
        *****

         */

       /* for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //RAM:
        //i:0 1 2 3
        //j:0 1 2 3
        //console:
        /*
        ***
        ***
        ***
         */


        //


/*
        *         i , j
        **
        ***
        ****
        *****

         */

        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
*/

       /* for (int i = 1; i <= 4 ; i++) {
            System.out.println( "Week " + i);
            for (int j = 1; j <= 7; j++) {
             System.out.print("Day"+ j + " ");
            }
            System.out.println();
        }
*/

    }
}
