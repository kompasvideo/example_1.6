package com.example.otus12.controller;

import com.example.otus12.dto.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/health")
public class HealthController {

    @GetMapping("/")
    public Health get() {
        return new Health("OK");
    }
}
