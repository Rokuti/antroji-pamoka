package lt.viltiesZiedas.receptai.model.repository;

import lt.viltiesZiedas.receptai.model.entity.Vartotojas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VartotojasRepository extends JpaRepository<Vartotojas, Long> {
    Vartotojas findByUsername(String username);
}