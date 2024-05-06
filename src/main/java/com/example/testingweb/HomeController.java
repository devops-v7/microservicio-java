package com.example.testingweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HomeController {

    @RequestMapping("/")
    public String greeting() {
        return "Hola, soy Rodrigo Orellana";
    }
}
