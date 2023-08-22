package lt.viltiesZiedas.receptai.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class ingredientas {
    @Id
    long id;
    String pavadinimas;
    String aprasymas;
    double kaina;
    int kolorijosPer100g;
}
