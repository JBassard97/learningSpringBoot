package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UserController {
    // Return a simple string
    @GetMapping("/users")
    public String getUsers() {
        return "All users";
    }

    // Make use of path variables or dynamic params
    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable("id") Long id) {
        return "Returning user with ID: " + id;
    }

}
