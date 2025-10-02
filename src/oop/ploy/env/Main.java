package oop.ploy.env;

import oop.ploy.A;

public class Main {
    public static void main(String[] args) {
      /*  Envirment b = new Birds();
        b.env();

        Envirment f = new Fish();
        f.env();

        Envirment h = new Humen();
        h.env();*/

        Envirment birds = new Birds();

        //poly(birds);
        poly(new Birds());

    }
    //Envirment <-- bird -> env
    public static void poly(Envirment envirment) {
        envirment.env();

    }
}

