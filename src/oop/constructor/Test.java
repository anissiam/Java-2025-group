package oop.constructor;

import java.util.Base64;

public class Test {





    public static String encodePassword(String password){

        if (password != null) {
            String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes());
            password = encodedPassword;
        }
        return password;
    }


    public static void addNumbers(int x, int y) {
        System.out.println(">" + x + " + " + y + " =");
        int sum = x + y;
        System.out.println(sum);

    }

}
