package uzduotis1;

import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Preke preke = nuskaitoIsConsoles();
        System.out.println(preke);
        Preke p1 = nuskaitoIsConsoles();
        System.out.println(p1);
        System.out.println("p1.getKaina() = " + p1.getKaina());
        System.out.println("preke.getPavadinimas() = " + preke.getPavadinimas());

    }

    public static Preke nuskaitoIsConsoles (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite Prekes id : ");
        int id = sc.nextInt();
        System.out.println("Iveskite pavadinima : ");
        sc.nextLine();
        String pavadinimas = sc.nextLine();
        System.out.println("Iveskite kaina : ");
        double kaina = sc.nextDouble();
        System.out.println("Iveskite kieky Sandelyje : ");
        int kiekisSandelyje = sc.nextInt();
        sc.nextLine();
        System.out.println("Iveskite kategorija :");
        String kategorija = sc.nextLine();
        return new Preke(id,pavadinimas,kaina,kiekisSandelyje,kategorija);
    }
}
