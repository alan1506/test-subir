package com.example.spring_boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SimpleController {
    @GetMapping("/status")
    public String getStatus() {
        return "OK prueba rollout 2";
    }

    @GetMapping("/health")
    public String getHealth() {
        return "OK prueba rollout 2";
    }
}
