package oop;

import java.util.Scanner;

// reusability //اعادة استخدام
public class Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sss = {6, 8, 7};
        newSum(sss);


        newSum(9, 7);
        /*printArray(5);
        System.out.println("======================================");
        printArray(3);*/

       /* int ava = sum() / 5;
        System.out.println(ava);
*/



      //  maxMin();



        /*String name = printName1();
        System.out.println(name.equals("sami"));
*/
       // printName();
       // System.out.println(printName1());
       // printMark();  // call / invoke

       // printNumber();

      //  System.out.println(printNumber1());

      //  System.out.println(printNumber2(10,50));

       /* System.out.println("1)Call printNumber\n2)Add numbers to print ");
        int c = scanner.nextByte();
        switch (c){
           case  1:printNumber();
            break;
            case 2 :
                System.out.println("Plz enter x");
                int sfsdffg = scanner.nextInt();

                System.out.println("Plz enter y");
                int asfasdhfn = scanner.nextInt();
                System.out.println(printNumber2(sfsdffg, asfasdhfn));
                break;
        }*/
    }


    public static void printNumber(){
        int x = 10;
        int y = 50;
        int z = (x+y)/2;

        System.out.println(z);
    }

    public static int printNumber1(){
        int x = 10;
        int y = 50;
        int z = (x+y)/2;

        return z;
    }

    public static int printNumber2(int x , int y ){

        int z = (x+y)/2;

        return z;
    }







    //function //block //method
        //function declataion
     public static void printMark(){
         int mark[] = {10, 50, 80, 60};
         for (int i = 0; i < mark.length; i++) {
             System.out.println("Mark " + mark[i]);
         }
    }

    /*
    public
    private
     */


    /*
     function declataion

     call function (invoke)

     */

    /*
    function
    header  public static void printMark()
    body    {}
    return void(*)  return type  int-> int
    () parameter / argument
     */
// access modifer /no A M   //return type  //function name ()

    public static void printName(){
     //   String name = returnName();

        System.out.println("Your name is "+ returnName().toUpperCase());
    }


    public static String printName1(){
      //  String name = returnName();
        return returnName().toUpperCase();
    }

    public static String returnName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter the name");
        String name = scanner.nextLine();

        return name;
    }



    public static void maxMin(){
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("Min = " + min);

    }




    public static int sum(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.println("Plz enter the num");
            int num = scanner.nextInt();

            sum += num;

        }

        return sum;

    }


    public static void printArray(int size){
        String[] names = new String[size];

        for (int i = 0; i < names.length; i++) {
            names[i] = returnName();
        }

        for (String name: names){
            System.out.println(name);
        }

    }


    public static int test(int num1 , int num2 ){
        return num1 + num2;
    }
        //Overload
    /*
    -change type of parameter
    -change number of parameter
     */
    public static String test(String num1 , String num2 ){
        return num1 + num2;
    }



    public static void runApp(){
        System.out.println(test("9", "8"));
        System.out.println(test(9,8));
    }



    public static void newSum(int num1 , int num2){
        System.out.println(num1 + num2);
    }
    public static void newSum(int [] numbers){
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }

        System.out.println(sum);

    }


    public static void printPerson(String name, int age) {

    }

  /*  public static void printPerson(String name,int language) {

    }*/



}
