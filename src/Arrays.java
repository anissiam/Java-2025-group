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

      /*  System.out.println("Plz enter size of array");
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
        }*/


       /* String[] names = {"Anis", "sami", "ali" , "Nena"};

        System.out.println("Plz enter the name");
        String name = scanner.nextLine();

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                System.out.println("Plz enter new name");
                names[i] = scanner.nextLine();
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }*/

        //{50 , 10 ,90 , 2 , 15}
      /*  System.out.println("Plz enter the size of Numbers");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        int max = 0 ,min = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Plz enter the number :" + (i + 1));
            numbers[i] = scanner.nextInt();
            if (i == 0) {
                max = numbers[i];
                min = numbers[i];
                continue;
            }
            if (max<numbers[i]){
                max = numbers[i];
            }
            if (min>numbers[i]){
                min = numbers[i];
            }
        }

        System.out.println("Max="+ max);
        System.out.println("Min="+ min);*/
        /*
        ram :
        max:90
        min:2
        size:5
         i:0,1,2,3,4,5
         numbers :{50,10 , 90, 2 , 15}
         number[0]:50
         number[1]:10
         number[2]:90
         number[3]:2
         number[4]:15

         */

        /*for (int num : numbers) {
            System.out.println(num);
        }*/

        /*
        numbers --> num
        1-> 50--> num
        2-> 10--> num

        console :50 , 10 .... 15
         */

       // System.out.println(java.util.Arrays.toString(numbers));










//        for (int i = 0; i < num1.length; i++) {
//
//        }


     /*   String[] names1 = {"Anis", "sami", "ali", "Nena", "mosa"};

        String[] names2 = {"Zenab", "sally", "mona", "sami"};


        for (int i = 0; i < names1.length; i++) {
            for (int j = 0; j < names2.length; j++) {
                if (names1[i].equalsIgnoreCase(names2[j])){
                    System.out.println(names1[i] +  " Found in names2");
                }
            }
        }*/


        /*

        2 D
        "Anis", "sami", "ali", "Nena", "mosa"
        "Zenab", "sally", "mona", "sami"


         */


     /*   int count = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase("ali")) {
                count++;

            }

        }

        System.out.println("Found " + count);
        */




        /**************************************************************************
        2D Array
        ************************************************************************ */

                         // rows , row[i]
       // int num[][] = new int[3][4];
        int num[][] = {{5,8,9},
                       {8,1,7,5},
                       {9,5,1}};

        System.out.println(num.length);  //عدد الصفوف
        System.out.println(num[0].length); // عدد العناصر داخل الصف الاول

/*
loop 1
تمشي على الصفوف
loop 2
تمشي على كل صف
 */
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "  ");

            }
            System.out.println();

        }
        /*
         ram :
          i :0 1
         j:0 1 2
        console:

         */


        /*
        num[0] = {5,8,9}
        num[1]={8,1,7,5}
        num[2]={9,5,1}


        /*
        (0,0)(0,1)(0,2)
        (1,0)(1,1)(1,2)(1,3)
        (2,0)(2,1)(2,2)

         */



      /*  for (int i = 0; i < num.length; i++) {

        }*/



    }
}
