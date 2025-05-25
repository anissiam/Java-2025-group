import javax.swing.*;

public class FirstClass {
  static   int g  = 10 ; // global var

        //method syntax
    // access modefire    // no access mod   // return type   //method name or function name  (parameter or argument)
  //header
    public static void main(String[] args) {
        int g = 50;
//body
   //     System.out.println(g);
       //System.out.println("Hello from console");  // call function   //invoke

      //  JOptionPane.showMessageDialog(null , "Hello  from view ");
     /*   System.out.println("anis");
        System.out.println("siam");
        System.out.print("good ");
        System.out.println("person");*/


 /*

  4 print command
 anis Siam
 age : 31
 major
 CS

  */




        // var declaration
        /*
        1. type
        2. name
        3. value
        4. size

        // Ram --> Heap
         */
       byte  firstVar=5; // 8 bit // 1 byte    // -128 : 127
        /*
        data type

        1. Primitive
            1.Numaric
                1. Integers // الارقام الصحيحة
                    1. byte  //1 byte  // 8 bit
                    2. short  // 2 byte // 16 bit
                    3. int     // 4 byte // 32 bit
                    4. long     // 8 byte // 64 bit
                2.Floating point // الارقام العشرية
                    1. float
                    2. double

            2. Non Num
                1. char  //الحروف
                2. boolean  // true false

        2. Non - Primitive
            class
            string
            array
            object
         */

        int x ;  // null   // local var // scoop
        x = 10;

       // System.out.print(x);



            // local var -> method >-> null
            // global var -> class >->  type intgers 0  , floating point  0.0


      //  int c = 180;
      //  System.out.println("The value =" +c);  // concatenate with value of c

      //  c = 800;

      //  System.out.println("c: "+c+ " The new value");

        //byte b = c;

 /*       int i = 500;
        System.out.println(i);
        double d = i;   //64 bit
        System.out.println(d);

        int w =(int) d;  //32 bit
        System.out.println(w);
        float f =(float) 50.0;*/
        oprations();


    }
    public void showName(){

        int x = 10;

        x = 50;

    }


    public static void oprations(){
        /*int x = 5;
        int y = 8;
        int w = 12;
        double z = x + y + w;

        System.out.println(z);
        System.out.println(x+y);

                    //25 /3 (int)  = 8  =>8.0
        double ava = z / 3;
        System.out.println("Ava =" + ava);

        int i = 0;
        System.out.println(i + 500);

        i += 1; //  i = i + 1;  i++ //
        System.out.println(i);

      i+=20; //  i = i + 20;
        System.out.println(i);

        i = i / 500;  // i/=500*/


       /* int i = 0;

        System.out.println(i + 1);
        System.out.println(i++); //print i // i = i+1

        System.out.println(i++); //print i // i = i+1

        ++i;  // i = i+1
        System.out.println(i + 5);
        System.out.println(i -8);
        System.out.println(--i); // i = i-1  //print i
        i += 5;  //i = i+5
        i++; //i=i+1

        System.out.println(++i); //i= i+1 // print i
        System.out.println(i--);  //print i // i= i-1
        System.out.println(++i);//i=i+1 // print i
        System.out.println(i+2); //
        System.out.println(i);*/



          //ram => 0 1 2 3 2 7 8 9 8 9
        //console => 1 0 1 8 -5 2 9 9 9 11 9


       /* int i = 0;

        System.out.println(i + 1);
        System.out.println(++i);
        System.out.println(100);
        System.out.println(i++);
        System.out.println(i+20);
        i++;
        i--;
        System.out.println(i*=10);
        System.out.println(i+10);
        i += 10;  // i = i+10

        System.out.println(--i);
        System.out.println(--i);
        System.out.println(i++);
        System.out.println(i);

        //RAM : 0 1 2 3 2 10 30 20 19 18 19
        //Console:1 1 100 1 22 20 10 19 18 18 19*/


        int x = 3;
        int y = 4;


        int z = ++y + x++;
        // inc // get y   +  get x //int
        // 5 / 5  + 3
        System.out.println(z);

        z = x++ + x;
        // get x  /5   + 5
        //4  + 5 = 9
        System.out.println(z);




    }

    public void showAge(){

        int x = 10;

         x = 50;

    }

}

