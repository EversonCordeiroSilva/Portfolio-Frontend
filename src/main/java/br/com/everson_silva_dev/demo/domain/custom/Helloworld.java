package br.com.everson_silva_dev.demo.domain.custom;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Helloworld {
    @GetMapping("/helloworld")
    public String helloworld() {
        return "Helloworld! :)";
    }
    @GetMapping("/*")
    @PutMapping("/*")
    @PostMapping("/*")
    @PatchMapping("/*")
    @DeleteMapping("/*")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String defaultResponse() {
        return "Not Found! :(";
    }
}
