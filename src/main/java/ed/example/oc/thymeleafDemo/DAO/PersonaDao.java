package ed.example.oc.thymeleafDemo.DAO;

import ed.example.oc.thymeleafDemo.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Integer> {
}
