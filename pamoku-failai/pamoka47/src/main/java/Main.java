import doumbaze.DbVeiksmai;
import entity.Produktas;

import java.sql.Connection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Connection jungtis = DbVeiksmai.prisijungtiPrieDb();
        ArrayList<Produktas> produktas = DbVeiksmai.gautiVisusProduktus(jungtis);
        produktas.forEach(p -> System.out.println(p));
    }
}
