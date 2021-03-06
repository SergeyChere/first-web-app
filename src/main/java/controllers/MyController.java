package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public String printSome(ModelMap model) {
        model.addAttribute("message", "Spring 3 MVC - Hello World");
        return "hello";
    }
}
