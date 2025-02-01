package com.example.controller; // Adjust based on your package structure

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        // Serve index.html from the static folder
        return "index.html"; // Spring Boot will automatically look for it in /static
    }

}
