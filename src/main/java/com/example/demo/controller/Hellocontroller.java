package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
    
    @GetMapping(value="/")
    public String getMethodName(){
        return "Olá Mundo, VSCode";
    }
}
