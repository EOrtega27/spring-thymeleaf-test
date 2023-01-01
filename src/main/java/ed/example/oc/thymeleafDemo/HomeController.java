package ed.example.oc.thymeleafDemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {
    @GetMapping("/")
    public String inicio(Model model){
        String mensaje = "Hola mundo con Thymeleaf";
        model.addAttribute("mensaje", mensaje);
        log.info("Controlador Spring MVC");
        return "index";
    }
}
