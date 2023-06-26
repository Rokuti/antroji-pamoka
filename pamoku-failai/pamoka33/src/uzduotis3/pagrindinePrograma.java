package uzduotis3;

import uzduotis1.Preke;

import java.util.Arrays;
import java.util.Scanner;

public class pagrindinePrograma {
    public static void main(String[] args) {
        Preke p1 = nuskaitoIsConsoles();
        Preke [] prekes = nuskaitytiPrekeMasyvaIsKonsoles();
        System.out.println("prekes = " + Arrays.toString(prekes));
        System.out.println("prekes[0].getKategorija() = " + prekes[0].getKategorija());
    }

    public static Preke nuskaitoIsConsoles() {
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
        return new Preke(id, pavadinimas, kaina, kiekisSandelyje, kategorija);
    }

    public static Preke[] nuskaitytiPrekeMasyvaIsKonsoles() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite kiek bus prekių skirtingų");
        int n = sc.nextInt();
        Preke[] prekes = new Preke[n];
        for (int i = 0; i < n; i++) {
            Preke preke = nuskaitoIsConsoles();
            prekes[i] = preke;
        }
        return prekes;
    }
}
