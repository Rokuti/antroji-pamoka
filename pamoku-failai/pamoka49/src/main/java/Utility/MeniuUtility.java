package Utility;

import doumbaze.DbVeiksmai;
import entity.Klientas;
import entity.Produktas;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class MeniuUtility {
    public static void rodytiMeniu() {
        System.out.println("Meniu. Įveskite skaičių punkto, kurį norite pasirinkti");
        System.out.println("1. Išvesti visus produktus");
        System.out.println("2. Surasti produktą pagal ID");
        System.out.println("3. Išvesti visus produktus, brangesnius už X");
        System.out.println("4. Ištrinti produktą pagal ID");
        System.out.println("5. Atnaujinti produktą pagal ID");
        System.out.println("6. Įdėti naują produktą");
        System.out.println("0. Sustabydti programą");
    }

    public static void vykdytiMeniu(Connection jungtis) {
        Scanner skait = new Scanner(System.in);
        boolean arRodytiMeniu = true;
        ArrayList<Produktas> produktai = new ArrayList<>();
        Produktas produktas;
        long id;
        while (arRodytiMeniu) {
            rodytiMeniu();
            int pasirinkimas = skait.nextInt();
            switch (pasirinkimas) {
                case 1:
                    produktai = DbVeiksmai.gautiVisusProduktus(jungtis);
                    produktai.forEach(p -> System.out.println(p));
                    isvestiBruksniukus();
                    break;
                case 2:
                    id = nuskaitytiId();
                    produktas = DbVeiksmai.gautiProduktaPagalId(jungtis, id);
                    System.out.println(produktas);
                    isvestiBruksniukus();
                    break;
                case 3:
                    System.out.println("Įveskite kainą - programa grąžins produktus tik brangesnius už tą kainą.");
                    double kaina = skait.nextDouble();
                    produktai = DbVeiksmai.gautiProduktusBrangesniusUz(jungtis, kaina);
                    produktai.forEach(p -> System.out.println(p));
                    isvestiBruksniukus();
                    break;
                case 4:
                    id = nuskaitytiId();
                    int kiekIstryne = DbVeiksmai.istrintiProduktaPagalId(jungtis, id);
                    System.out.println("Buvo ištrinta " + kiekIstryne + " įrašų.");
                    isvestiBruksniukus();
                    break;
                case 5:
                    produktas = nuskaitytiProduktaAtnaujinimui();
                    int kiekAtnaujino = DbVeiksmai.atnaujintiProdukta(jungtis, produktas);
                    System.out.println("Buvo atnaujinta " + kiekAtnaujino + " įrašų.");
                    isvestiBruksniukus();
                    break;
                case 6:
                    produktas = nuskaitytiProduktaBeId();
                    int kiekIdejo = DbVeiksmai.pridetiProdukta(jungtis, produktas);
                    System.out.println("Buvo pridėta " + kiekIdejo + " įrašų.");
                    isvestiBruksniukus();
                    break;
                case 0:
                    arRodytiMeniu = false;
                    break;
            }
        }

    }

    public static void isvestiBruksniukus() {
        System.out.println("-----------------------------------");
    }

    public static Produktas nuskaitytiProduktaAtnaujinimui() {
        Produktas produktas = nuskaitytiProduktaBeId();
        produktas.setId(nuskaitytiId());
        return produktas;
    }

    public static Produktas nuskaitytiProduktaBeId() {
        Scanner skait = new Scanner(System.in);
        Produktas produktas = new Produktas();
        System.out.println("Įveskite pavadinimą: ");
        produktas.setPavadinimas(skait.nextLine());
        System.out.println("Įveskite kainą: ");
        produktas.setKaina(skait.nextDouble());
        return produktas;
    }

    public static long nuskaitytiId() {
        Scanner skait = new Scanner(System.in);
        System.out.println("Įveskite ID");
        long id = skait.nextLong();
        return id;
    }
    public static void rodytiKlientuMeniu() {
        System.out.println("Meniu. Įveskite skaičių punkto, kurį norite pasirinkti");
        System.out.println("1. Išvesti visus klientus");
        System.out.println("2. Surasti klienta pagal ID");
        System.out.println("3. Išvesti visus klientus, is ivestos valstijos");
        System.out.println("4. Ištrinti klienta pagal ID");
        System.out.println("5. Atnaujinti klienta pagal ID");
        System.out.println("6. Įdėti naują klienta");
        System.out.println("0. Sustabydti programą");
    }
    public static void vykdytiKlientuMeniu(Connection jungtis) {
        Scanner skait = new Scanner(System.in);
        boolean arRodytiMeniu = true;
        ArrayList<Klientas> klientai = new ArrayList<>();
        Klientas klientas;
        long id;
        while (arRodytiMeniu) {
            rodytiKlientuMeniu();
            int pasirinkimas = skait.nextInt();
            switch (pasirinkimas) {
                case 1:
                    klientai = DbVeiksmai.gautiVisusKlientus(jungtis);
                    klientai.forEach(p -> System.out.println(p));
                    isvestiBruksniukus();
                    break;
                case 2:
                    id = nuskaitytiId();
                    klientas = DbVeiksmai.gautiKlientaPagalId(jungtis, id);
                    System.out.println(klientas);
                    isvestiBruksniukus();
                    break;
                case 3:
                    System.out.println("Įveskite Valstija - programa grąžins klientus tik is tos valstijos.");
                    skait.nextLine();
                    String valstija = skait.nextLine();
                    klientai = DbVeiksmai.gautiKlientusIs(jungtis, valstija);
                    klientai.forEach(p -> System.out.println(p));
                    isvestiBruksniukus();
                    break;
                case 4:
                    id = nuskaitytiId();
                    int kiekIstryne = DbVeiksmai.istrintiKlientaPagalId(jungtis, id);
                    System.out.println("Buvo ištrinta " + kiekIstryne + " įrašų.");
                    isvestiBruksniukus();
                    break;
                case 5:
                    klientas = nuskaitytiKlientusAtnaujinimui();
                    int kiekAtnaujino = DbVeiksmai.atnaujintiKlieta(jungtis, klientas);
                    System.out.println("Buvo atnaujinta " + kiekAtnaujino + " įrašų.");
                    isvestiBruksniukus();
                    break;
                case 6:
                    klientas = nuskaitytiKlientusBeId();
                    int kiekIdejo = DbVeiksmai.pridetiKlienta(jungtis, klientas);
                    System.out.println("Buvo pridėta " + kiekIdejo + " įrašų.");
                    isvestiBruksniukus();
                    break;
                case 0:
                    arRodytiMeniu = false;
                    break;
            }
        }

    }
    public static Klientas nuskaitytiKlientusBeId() {
        Scanner skait = new Scanner(System.in);
        Klientas klientas = new Klientas();
        System.out.println("Įveskite pavadinimą: ");
        klientas.setPavadinimas(skait.nextLine());
        System.out.println("Įveskite VALSTIJA: ");
        klientas.setValstija(skait.nextLine());
        return klientas;
    }
    public static Klientas nuskaitytiKlientusAtnaujinimui() {
        Klientas klientas = nuskaitytiKlientusBeId();
        klientas.setId(nuskaitytiId());
        return klientas;
    }
}
