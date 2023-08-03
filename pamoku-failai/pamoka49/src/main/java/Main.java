import Utility.MeniuUtility;
import doumbaze.DbVeiksmai;

import java.sql.Connection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Connection jungtis = DbVeiksmai.prisijungtiPrieDb();
        MeniuUtility.vykdytiMeniu(jungtis);
        MeniuUtility.vykdytiKlientuMeniu(jungtis);
    }
}
