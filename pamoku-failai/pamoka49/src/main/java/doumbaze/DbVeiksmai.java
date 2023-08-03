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
    private static final String Q_GAUTI_PRODUKTA_PAGAL_ID = "select * from produktai where id = ?;";
    private static final String DEL_PRODUKTAS_ID = "delete from produktai where id = ?;";
    private static final String Q_GAUTI_PRODUKTUS_BRANGESNIUS_UZ = "select * from produktai where kaina > ?;";
    private static final String INS_PRODUKTAS = "INSERT INTO produktai(pavadinimas, kaina) VALUES (?, ?);";
    private static final String UPD_PRODUKTAS = "update produktai set pavadinimas = ?, kaina = ? where id = ?";
    private static final String INS_Klientas = "INSERT INTO klientai(pavadinimas, valstija) VALUES (?, ?);";
    private static final String Q_SELECT_KLIENTAI = "select * from klientai";
    private static final String UPD_KLIENTAI = "update klientai set pavadinimas = ?, valstija = ? where id = ?";
    private static final String DEL_KLIENTAS_ID = "delete from klientai where id = ?;";
    private static final String Q_GAUTI_KLIENTUS_IS = "select * from klientai where valstija = ?;";
    private static final String Q_GAUTI_KLIETA_PAGAL_ID = "select * from klientai where id = ?;";

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
    public static Produktas gautiProduktaPagalId(Connection jungtis, long id) {
        Produktas produktas = new Produktas();
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(Q_GAUTI_PRODUKTA_PAGAL_ID);
            paruostukas.setLong(1, id);
            ResultSet resultSet = paruostukas.executeQuery();
            while (resultSet.next()) {
                produktas.setId(resultSet.getLong("id"));
                produktas.setPavadinimas(resultSet.getString("pavadinimas"));
                produktas.setKaina(resultSet.getDouble("kaina"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produktas;
    }
    public static ArrayList<Produktas> gautiProduktusBrangesniusUz(Connection jungtis, double kaina) {
        ArrayList<Produktas> produktai = new ArrayList<>();
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(Q_GAUTI_PRODUKTUS_BRANGESNIUS_UZ);
            paruostukas.setDouble(1, kaina);
            ResultSet resultSet = paruostukas.executeQuery();
            while (resultSet.next()) {
                Produktas produktas = new Produktas();
                produktas.setId(resultSet.getLong("id"));
                produktas.setPavadinimas(resultSet.getString("pavadinimas"));
                produktas.setKaina(resultSet.getDouble("kaina"));
                produktai.add(produktas);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produktai;
    }
    public static int istrintiProduktaPagalId(Connection jungtis, long id) {
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(DEL_PRODUKTAS_ID);
            paruostukas.setLong(1, id);
            return paruostukas.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static int pridetiProdukta(Connection jungtis, Produktas produktas) {
        try {
            PreparedStatement ps = jungtis.prepareStatement(INS_PRODUKTAS);
            ps.setString(1, produktas.getPavadinimas());
            ps.setDouble(2, produktas.getKaina());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static int atnaujintiProdukta(Connection jungtis, Produktas produktas) {
        try {
            PreparedStatement ps = jungtis.prepareStatement(UPD_PRODUKTAS);
            ps.setString(1, produktas.getPavadinimas());
            ps.setDouble(2, produktas.getKaina());
            ps.setLong(3, produktas.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<Klientas> gautiVisusKlientus(Connection jungtis) {
        ArrayList<Klientas> visiKlientai = new ArrayList<>();
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(Q_SELECT_KLIENTAI);
            ResultSet rs = paruostukas.executeQuery();
            while (rs.next()) {
                Klientas klientas = new Klientas();
                klientas.setId(rs.getLong("id"));
                klientas.setPavadinimas(rs.getString("pavadinimas"));
                klientas.setValstija(rs.getString("valstija"));
                visiKlientai.add(klientas);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return visiKlientai;
    }
    public static int atnaujintiKlieta(Connection jungtis, Klientas klientas) {
        try {
            PreparedStatement ps = jungtis.prepareStatement(UPD_KLIENTAI);
            ps.setString(1, klientas.getPavadinimas());
            ps.setString(2, klientas.getValstija());
            ps.setLong(3, klientas.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static int pridetiKlienta(Connection jungtis, Klientas klientas) {
        try {
            PreparedStatement ps = jungtis.prepareStatement(INS_Klientas);
            ps.setString(1, klientas.getPavadinimas());
            ps.setString(2, klientas.getValstija());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static int istrintiKlientaPagalId(Connection jungtis, long id) {
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(DEL_KLIENTAS_ID);
            paruostukas.setLong(1, id);
            return paruostukas.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<Klientas> gautiKlientusIs(Connection jungtis, String valstija) {
        ArrayList<Klientas> k = new ArrayList<>();
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(Q_GAUTI_KLIENTUS_IS);
            paruostukas.setString(1, valstija);
            ResultSet resultSet = paruostukas.executeQuery();
            while (resultSet.next()) {
                Klientas klientas = new Klientas();
                klientas.setId(resultSet.getLong("id"));
                klientas.setPavadinimas(resultSet.getString("pavadinimas"));
                klientas.setValstija(resultSet.getString("valstija"));
                k.add(klientas);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return k;
    }
    public static Klientas gautiKlientaPagalId(Connection jungtis, long id) {
        Klientas klientas = new Klientas();
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(Q_GAUTI_KLIETA_PAGAL_ID);
            paruostukas.setLong(1, id);
            ResultSet resultSet = paruostukas.executeQuery();
            while (resultSet.next()) {
                klientas.setId(resultSet.getLong("id"));
                klientas.setPavadinimas(resultSet.getString("pavadinimas"));
                klientas.setValstija(resultSet.getString("valstija"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return klientas;
    }
}
