package oop.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_ {
    public static void main(String[] args) {

        int[] numbers = {20, 5, 8, 60, 20};
        numbers[0] = 10;
        numbers[1] = 2;

        //{20,5,8,60,20}


        ArrayList<Integer> list0 = new ArrayList<>(Arrays.asList(20,5,8,60,20));
       /* list.add(0,10);
        list.add(8, 2);
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(9);*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,20);
        //list.add(2,5);
        list.addAll(list0);
        list.add(1, 99); //shift
        list.set(5, 222); //replace


      //  list.remove(222);
        list.removeIf(x -> x %2 == 0);
        System.out.println(list);


        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("ali");
        stringArrayList.add("ahmed");
        stringArrayList.add("anis");
        stringArrayList.add("sara");

       // stringArrayList.remove(1);//index

      //  stringArrayList.remove("ali"); //value


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("anis");
        list1.add("sara");

        System.out.println(list1.get(0));
        //list1.set(0, "sami");


        stringArrayList.removeAll(list1);

        System.out.println(stringArrayList);


    }
}
