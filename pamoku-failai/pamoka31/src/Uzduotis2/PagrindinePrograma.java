package Uzduotis2;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Trikampis trikampis = new Trikampis();
        trikampis.a = 12.1;
        trikampis.b = 14.5;
        trikampis.c = 18.12;
        trikampis.apskaiciuotiKampa();
        Trikampis t2 = new Trikampis(12.13,14.15,16.01);
        System.out.println("t2 = " + t2);
        System.out.println(trikampis);
        System.out.println("t2.perimetras() = " + t2.perimetras());
        System.out.println("trikampis.perimetras() = " + trikampis.perimetras());
        trikampis.sumazint(4);
        System.out.println(trikampis);
        System.out.println(t2);
        System.out.println(" trikampio plotas = "+ trikampis.plotas());
        System.out.println("trikampio t2 plotas = "+ t2.plotas());
        System.out.println("didziausia krastine = "+ trikampis.kuriDidziausia());
        System.out.println(t2);
        System.out.println(trikampis);
        Trikampis t3 = new Trikampis(12,20.12,18.11,80,40,50);
        System.out.println(t3);

    }
}
