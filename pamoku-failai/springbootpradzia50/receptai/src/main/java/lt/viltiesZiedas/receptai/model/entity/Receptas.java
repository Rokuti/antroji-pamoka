package lt.viltiesZiedas.receptai.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Receptas {
    @Id
    long id;
    String pavadinimas;
    String aprasymas;
    double kaina;
    int kolorijosPer100g;
    @ManyToOne
    ReceptoKategorija kategorija;
}
