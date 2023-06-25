package uzduotis3;

public class pagrindePrograma {
    public static void main(String[] args) {
        Preke preke1 = new Preke("Obuolys", 0.5, "Vaisiai", 10);
        System.out.println(preke1.getPavadinimas());

        preke1.setKiekis(14);
        System.out.println(preke1);

        preke1.keistiKaina(20);
        System.out.println(preke1);

        preke1.keistiKaina(-50);
        System.out.println(preke1);

        System.out.println(preke1.arUztenka(5));
        System.out.println(preke1.arUztenka(15));

        Preke preke2 = new Preke("Bananai", 0.8, "Vaisiai", 20);
        Preke preke3 = new Preke("Morkos", 0.3, "Darzoves", 30);

        System.out.println(preke1.palygintiKainas(preke2));
        System.out.println(preke2.palygintiKainas(preke3));

        System.out.println(preke1.arTaPatiKategorija(preke2));
        System.out.println(preke2.arTaPatiKategorija(preke3));
    }
}
