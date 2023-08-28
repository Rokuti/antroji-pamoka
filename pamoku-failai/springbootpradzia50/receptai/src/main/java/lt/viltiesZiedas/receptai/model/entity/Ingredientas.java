package lt.viltiesZiedas.receptai.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Ingredientas {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
    private String pavadinimas;
    private String aprasymas;
    @Column(length = 1024)
    private double kaina;
    private int kolorijosPer100g;

    @ManyToMany
    @JoinTable(
            name = "recepto_ingredientai",
            joinColumns = @JoinColumn(name = "ingrediento_id"),
            inverseJoinColumns = @JoinColumn(name = "recepto_id")
    )
    private Set<Receptas> receptai;

    public Ingredientas() {
    }

    public Ingredientas(long id, String pavadinimas, String aprasymas, double kaina, int kolorijosPer100g, Set<Receptas> receptai) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.aprasymas = aprasymas;
        this.kaina = kaina;
        this.kolorijosPer100g = kolorijosPer100g;
        this.receptai = receptai;
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

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public int getKolorijosPer100g() {
        return kolorijosPer100g;
    }

    public void setKolorijosPer100g(int kolorijosPer100g) {
        this.kolorijosPer100g = kolorijosPer100g;
    }

    public Set<Receptas> getReceptai() {
        return receptai;
    }

    public void setReceptai(Set<Receptas> receptai) {
        this.receptai = receptai;
    }

    @Override
    public String toString() {
        return "ingredientas{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", aprasymas='" + aprasymas + '\'' +
                ", kaina=" + kaina +
                ", kolorijosPer100g=" + kolorijosPer100g +
                ", receptai=" + receptai +
                '}';
    }
}
