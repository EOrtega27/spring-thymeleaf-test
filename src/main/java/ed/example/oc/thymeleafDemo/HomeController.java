package ed.example.oc.thymeleafDemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {
    @Value("${index.mensaje}")
    private String saludo;
    @GetMapping("/")
    public String inicio(Model model){
        String mensaje = "Hola mundo con Thymeleaf";
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        log.info("Controlador Spring MVC");
        return "index";
    }
}
