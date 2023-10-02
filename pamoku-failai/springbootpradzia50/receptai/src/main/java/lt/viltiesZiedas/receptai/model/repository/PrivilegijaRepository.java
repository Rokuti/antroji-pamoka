package lt.viltiesZiedas.receptai.model.repository;

import lt.viltiesZiedas.receptai.model.entity.Privilegija;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegijaRepository extends JpaRepository<Privilegija, Long> {
    Privilegija findByPavadinimas(String pavadinimas);
}
