package ed.example.oc.thymeleafDemo.web;

import ed.example.oc.thymeleafDemo.DAO.PersonaDao;
import ed.example.oc.thymeleafDemo.domain.Persona;
import ed.example.oc.thymeleafDemo.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class HomeController {
    @Value("${index.mensaje}")
    private String saludo;

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String lstBD(Model model){
        String mensaje = "Lista desde MySQL";

        var personas = personaService.listPersona();

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("personas", personas);
        log.info("Controlador Spring MVC");
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona){
        personaService.guardar(persona);
        return "redirect:/";
    }
    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model){
        persona = personaService.encontrarPersona(persona.getIdPersona());
        model.addAttribute("persona", persona);
        return "modificar";
    }

    @GetMapping("/eliminar/{idPersona}")
    public String eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/";
    }
}
