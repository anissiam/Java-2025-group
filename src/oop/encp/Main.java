package oop.encp;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
      /*  bank1.name = "Anis";
        bank1.age = 25;  //set data // store // push
        bank1.balance = 100;
        bank1.accountNumber = "123456789";*/

      //  System.out.println(bank1.balance);  //get data


       /* bank1.setName("Anis");

        System.out.println(bank1.getName());*/


        Student student = new Student();
        student.setName("Anis");
        student.setAge(25);
        student.setMark(90);


        Student student1 = new Student("Sami", 20, 80);
        student.setName("Mosa");

        System.out.println(student.getAge());

    }


}
