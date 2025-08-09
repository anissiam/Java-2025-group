package oop.interfaces.computer;

import java.io.InputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HP hp = new HP();
        hp.start();
        hp.shutdown();

        String[] colors = {"red", "blue", "green"};
        hp.setRGB(colors);


        System.out.println(Arrays.toString(hp.getRGB()));



        Samsung samsung = new Samsung();


    }
}
