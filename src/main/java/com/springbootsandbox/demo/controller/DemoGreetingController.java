package com.springbootsandbox.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting")
public class DemoGreetingController {

    @GetMapping("/")
    public String helloWorld()
    {
        return "Hello world!";
    }
}
