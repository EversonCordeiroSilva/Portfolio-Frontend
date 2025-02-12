package br.com.everson_silva_dev.demo.domain.templates;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Control {
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String home() {
        return "index";
    }
}
