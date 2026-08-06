package com.example.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homecontroller {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/message")
    @ResponseBody
    public String message() {
        return "Hello from Backend";
    }
}