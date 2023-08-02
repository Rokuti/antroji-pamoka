import doumbaze.DbVeiksmai;
import entity.Klientas;
import entity.Produktas;

import java.sql.Connection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Connection jungtis = DbVeiksmai.prisijungtiPrieDb();
        Produktas produktas = DbVeiksmai.gautiProduktaPagalId(jungtis, 5);
        System.out.println(produktas);
        ArrayList<Produktas> brangesniUz500 = DbVeiksmai.gautiProduktusBrangesniusUz(jungtis, 500);
        brangesniUz500.forEach(b -> System.out.println(b));
        int x = DbVeiksmai.istrintiProduktaPagalId(jungtis, 26);
        System.out.println("Istrinta :" + x);
        Produktas naujasProduktas = new Produktas();
        naujasProduktas.setPavadinimas("Kompiuteris");
        naujasProduktas.setKaina(789.99);
        int kiekPridejo = DbVeiksmai.pridetiProdukta(jungtis, naujasProduktas);
        System.out.println("Buvo pridėta " + kiekPridejo + " įrašų");
        Produktas atnaujinamasProd = new Produktas(5, "Rašomasis stalas", 399.79);
        int kiekAtnaujino = DbVeiksmai.atnaujintiProdukta(jungtis, atnaujinamasProd);
        System.out.println("Buvo atnaujinta " + kiekAtnaujino + " įrašų");
        ArrayList<Klientas> visiKlientai = DbVeiksmai.gautiVisusKlientus(jungtis);
        visiKlientai.forEach(k -> System.out.println(k));
        Klientas atnaujintasKlientas = new Klientas(7,"DHXL","NANA");
        int y = DbVeiksmai.atnaujintiKlieta(jungtis, atnaujintasKlientas);
        System.out.println("Buvo Atnaujinta klientu : " + y);
        Klientas pridededamasKlientas = new Klientas();
        pridededamasKlientas.setPavadinimas("WOW");
        pridededamasKlientas.setValstija("AHA");
        int c = DbVeiksmai.pridetiKlienta(jungtis, pridededamasKlientas);
        System.out.println("Buvo prideta klientu : " + c);
        int v = DbVeiksmai.istrintiKlientaPagalId(jungtis, 8);
        System.out.println("Buvo istrinta klientu : " + v);
        ArrayList<Klientas> isAha = DbVeiksmai.gautiKlientusIs(jungtis, "AHA");
        isAha.forEach(i -> System.out.println(i));

    }
}
