package com.dasi.demotest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/output")
    public String get(){
        return "Test";
    }
}
