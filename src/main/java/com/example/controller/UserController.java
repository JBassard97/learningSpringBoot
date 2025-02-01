package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.MessageResponse;

import java.util.List;
import java.util.Arrays;

@RestController
public class UserController {

    // Return a simple string
    @GetMapping("/users")
    public List<String> getUsers() {
        return Arrays.asList("John", "Jane", "Doe");
    }

    // Make use of dynamic path variables
    @GetMapping("/users/{id}")
    public MessageResponse getUserById(@PathVariable("id") Long id) {
        String message = "Returning user with ID: " + id;
        return new MessageResponse(message);
    }

    // Get users by their role
    // ex: localhost:8080/users/role?role=admin
    @GetMapping("/users/role")
    public String getUsersByRole(@RequestParam("role") String role) {
        return "Returning users with the " + role + " role.";
    }

}
