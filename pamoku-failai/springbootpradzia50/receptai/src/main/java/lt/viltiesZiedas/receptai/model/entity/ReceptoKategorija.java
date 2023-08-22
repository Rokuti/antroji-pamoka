package lt.viltiesZiedas.receptai.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;

@Entity

public class ReceptoKategorija {
    @Id
    long id;
    String pavadinimas;
    @OneToMany
    ArrayList<Receptas> kategorijaReceptai;

}
