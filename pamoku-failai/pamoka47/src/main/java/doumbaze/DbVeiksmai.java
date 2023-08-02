package doumbaze;

import entity.Klientas;
import entity.Produktas;

import java.sql.*;
import java.util.ArrayList;

public class DbVeiksmai {
    public static final String DB_NUORODA = "jdbc:mysql://localhost:3306/p42_u1_parduotuve";
    private static final String DB_USER = "root";
    private static final String DB_PSW = "";
    private static final String Q_SELECT_PRODUKTAI = "select * from produktai";
    private static final String Q_SELECT_KLIENTAI = "select * from klientai";
    public static Connection prisijungtiPrieDb() {
        Connection jungtis;
        try {
            jungtis = DriverManager.getConnection(DB_NUORODA, DB_USER, DB_PSW);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return jungtis;
    }

    public static ArrayList<Produktas> gautiVisusProduktus(Connection jungtis) {
        ArrayList<Produktas> visiProduktai = new ArrayList<>();
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(Q_SELECT_PRODUKTAI);
            ResultSet rs = paruostukas.executeQuery();
            while (rs.next()) {
                Produktas produktas = new Produktas();
                produktas.setId(rs.getLong("id"));
                produktas.setPavadinimas(rs.getString("pavadinimas"));
                produktas.setKaina(rs.getDouble("kaina"));
                visiProduktai.add(produktas);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return visiProduktai;
    }
    public static ArrayList<Klientas> gautiVisusKlientus(Connection jungtis) {
        ArrayList<Klientas> visiKlietai = new ArrayList<>();
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(Q_SELECT_KLIENTAI);
            ResultSet rs = paruostukas.executeQuery();
            while (rs.next()) {
                Klientas klientas = new Klientas();
                klientas.setId(rs.getLong("id"));
                klientas.setPavadinimas(rs.getString("pavadinimas"));
                klientas.setValstija(rs.getString("valstija"));
                visiKlietai.add(klientas);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return visiKlietai;
    }
}
