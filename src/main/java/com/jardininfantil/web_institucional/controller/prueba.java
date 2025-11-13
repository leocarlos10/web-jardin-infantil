package com.jardininfantil.web_institucional.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class prueba {

    @GetMapping("/mensaje")
    public String mensaje() {
        return "Hola desde el controlador de prueba";
    }
    
}
