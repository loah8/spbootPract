package brkim.pract.spbootPract.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"/","/index"})
    public String hellocontroller() {
        return "index";
    }
}
