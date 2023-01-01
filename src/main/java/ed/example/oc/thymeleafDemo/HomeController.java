package ed.example.oc.thymeleafDemo;

import ed.example.oc.thymeleafDemo.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class HomeController {
    @Value("${index.mensaje}")
    private String saludo;
    @GetMapping("/")
    public String inicio(Model model){
        String mensaje = "Hola mundo con Thymeleaf";

        //lista de lstPersonas a iterar
        var persona1 = new Persona();
        persona1.setEmail("jPerez@email.com");
        persona1.setName("Juan");
        persona1.setLastname("Perez");
        persona1.setPhone("987654321");

        var persona2 = new Persona();
        persona2.setEmail("cGomez@email.com");
        persona2.setName("Carla");
        persona2.setLastname("Gomez");
        persona2.setPhone("987654321");

        var persona3 = new Persona();
        persona3.setEmail("eLopez@email.com");
        persona3.setName("Esteban");
        persona3.setLastname("Lopez");
        persona3.setPhone("987654321");

        var personas = Arrays.asList(persona1, persona2, persona3);

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("personas", personas);
        log.info("Controlador Spring MVC");
        return "index";
    }

    @GetMapping("/lstVacia")
    public String lstVacia(Model model){
        String mensaje = "Hola mundo con Thymeleaf";


        List<Persona> personas = new ArrayList<>();

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("personas", personas);
        log.info("Controlador Spring MVC");
        return "index";
    }
}
