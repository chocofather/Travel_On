package com.example.travel_on.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TravelController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
