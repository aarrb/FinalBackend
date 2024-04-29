package C322FinalBackend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//Home Controller when you hit the / endpoint
@RestController
@CrossOrigin
public class HomeController {

    @GetMapping("/")
    public String greeting() {
        return "Welcome to the flowers service!";
    }
}

