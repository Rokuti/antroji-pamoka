package entity;

public class Klientas {
    long id;
    String pavadinimas;
    String valstija;

    public Klientas() {
    }

    public Klientas(long id, String pavadinimas, String valstija) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.valstija = valstija;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getValstija() {
        return valstija;
    }

    public void setValstija(String valstija) {
        this.valstija = valstija;
    }

    @Override
    public String toString() {
        return "Klientas{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", valstija='" + valstija + '\'' +
                '}';
    }
}


