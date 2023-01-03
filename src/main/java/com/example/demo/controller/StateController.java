package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {

    @GetMapping("/")
    public String index() {
        return "Hello This is my first app";
    }
}
