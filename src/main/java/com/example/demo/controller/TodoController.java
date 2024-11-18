package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @GetMapping("/")
    public String home() {
        return "todoList";
    }
    @GetMapping("/api/v1/user")
    public ResponseEntity<?> getUser() {
        return ResponseEntity.ok("82241006");
    }
}
