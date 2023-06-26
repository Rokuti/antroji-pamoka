package uzduotis2;

import java.util.Arrays;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Preke preke1 = new Preke(17, "Kėdė", 18.99, 174, "baldai");
        Preke preke2 = new Preke(18, "Stalas", 185.99, 20, "baldai");
        Preke preke3 = new Preke(9, "Kėdė", 74.99, 14, "baldai");

        Preke[] prekes = {preke1,preke2,preke3};
        System.out.println("prekes[] = " + Arrays.toString(prekes));
        System.out.println("Preke[0] = " + prekes[0]);
        System.out.println("prekes[2] = " + prekes[2]);
        System.out.println("prekes[1].getKaina() = " + prekes[1].getKaina());
    }
}
