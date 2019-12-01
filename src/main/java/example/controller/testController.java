package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class testController {
    @RequestMapping("/index")
    public void index() {
        System.out.println("test");
    }
}
