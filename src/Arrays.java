import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        1 e known
        2 s known
         */

        /*
        50, 80 10 ,2 90 , 30
         */
                    //0 , 1 , 2  , 3, 4 , 5
       /* int []num = {50, 80, 10 ,2  ,90 , 30 , 50, 80, 10 ,2  ,90 , 30,50, 80, 10 ,2  ,90 , 30,50, 80, 10 ,2  ,90 , 3050, 80, 10 ,2  ,90 , 30};

        System.out.println(num.length);

        System.out.println(num[0]); //element 1
        System.out.println(num[1]); // 2
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);
       // System.out.println(num[6]);
       // System.out.println(num[7]);
     //   System.out.println(num[-1]);

        int x = num[2];
        System.out.println("X =" + x);

        num[2] = 9000;
        System.out.println("num[2] =" + num[2]);

        int z = num[0] + num[2];
        System.out.println( "Z=:"+ z);

        for (int i = 0; i <num.length; i++) {
            System.out.println("num[" + i + "]="+ num[i]);
        }*/



        /*
        array 7
         */

       // int[] num1 = new int[1000];


        int[] marks = {60, 80, 30, 50, 10};

        /*
        print marks
        print success , failed
        print ava
        print pers
         */

        /*for (int i = 0; i < marks.length; i++) {
            System.out.println("mark:" + marks[i]);
        }*/


        /*int sum = 0;
        for (int i = 0; i < marks.length; i++) {

            if (marks[i]>=50){
                System.out.println("mark:" + marks[i] + " Success");

            }else {
                System.out.println("mark:" + marks[i] + " Filed");

            }

            sum += marks[i];


        }

        int ava = sum / marks.length;
        System.out.println("Ava = " + ava);

        System.out.println("Perc = " + (ava*100)/100);
*/


        //{10 , 2 ,3 ,9 ,7 ,5}
        //

        /*System.out.println("Plz enter size of array");
        int size = scanner.nextInt();
        int[] num1 = new int[size];



        for (int i = 0; i < num1.length; i++) {
            System.out.println("Enter the element");
            num1[i] = scanner.nextInt();
        }

        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);

        }*/

        System.out.println("Plz enter size of array");
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[size];


        for (int i = 0; i < names.length; i++) {
            System.out.println("Plz enter the name");
            names[i] = scanner.nextLine();
        }

        System.out.println("Search fo :");
        String search = scanner.nextLine();

        boolean found = false;



        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(search)){
                System.out.println("Found");
                found = !found;
                break;
            }
        }

        if (!found){
            System.out.println("Name not Found");
        }





//        for (int i = 0; i < num1.length; i++) {
//
//        }



    }
}
