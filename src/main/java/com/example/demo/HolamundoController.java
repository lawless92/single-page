package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolamundoController {

    @GetMapping("/saludo")
    public String saludar(Model model) {
        // Pasamos datos al HTML usando el objeto Model
        model.addAttribute("mensaje", "¡Hola desde Spring Boot con Thymeleaf!");
        model.addAttribute("Fecha", new java.util.Date().toString());
        
        // Retornamos el nombre del archivo HTML (sin el .html)
        return "hola"; 
    }
}
