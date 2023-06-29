public class Filmai {
    private int id;

    private  String pavadinimas;
    private  double ivertinimas;
    private String zanras;
    private  double trukme ;
    private  int isleidimoMetai;
     private  double kaina;

    public Filmai() {
    }

    public Filmai(int id, String pavadinimas, double ivertinimas, String zanras,
                  double trukme, int isleidimoMetai, double kaina) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.ivertinimas = ivertinimas;
        this.zanras = zanras;
        this.trukme = trukme;
        this.isleidimoMetai = isleidimoMetai;
        this.kaina = kaina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public double getIvertinimas() {
        return ivertinimas;
    }

    public void setIvertinimas(double ivertinimas) {
        this.ivertinimas = ivertinimas;
    }

    public String getZanras() {
        return zanras;
    }

    public void setZanras(String zanras) {
        this.zanras = zanras;
    }

    public double getTrukme() {
        return trukme;
    }

    public void setTrukme(double trukme) {
        this.trukme = trukme;
    }

    public int getIsleidimoMetai() {
        return isleidimoMetai;
    }

    public void setIsleidimoMetai(int isleidimoMetai) {
        this.isleidimoMetai = isleidimoMetai;
    }
    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    @Override
    public String toString() {
        return "Filmai{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", ivertinimas=" + ivertinimas +
                ", zanras='" + zanras + '\'' +
                ", trukme=" + trukme +
                ", isleidimoMetai=" + isleidimoMetai +
                ", kaina=" + kaina +
                '}';
    }
}
