package ed.example.oc.thymeleafDemo.service;

import ed.example.oc.thymeleafDemo.DAO.PersonaDao;
import ed.example.oc.thymeleafDemo.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    @Autowired
    PersonaDao personaDao;

    public List<Persona> listPersona(){
        return (List<Persona>) personaDao.findAll();
    }

    public void guardar(Persona persona){
        personaDao.save(persona);
    }

    public void eliminar(Persona persona){
        personaDao.delete(persona);
    }

    public Persona encontrarPersona(int idPersona){
        return personaDao.findById(idPersona).orElse(null);
    }
}
