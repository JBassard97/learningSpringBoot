package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    // Return index.html for non-API routes
    @GetMapping("/")
    public String index() {
        return "index.html"; // Spring Boot will forward to /index.html
    }

    @GetMapping("/about")
    public String about() {
        return "index.html";
    }
}
