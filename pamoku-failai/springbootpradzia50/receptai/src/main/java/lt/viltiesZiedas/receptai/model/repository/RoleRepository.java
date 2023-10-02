package lt.viltiesZiedas.receptai.model.repository;

import lt.viltiesZiedas.receptai.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByPavadinimas(String pavadinimas);

}