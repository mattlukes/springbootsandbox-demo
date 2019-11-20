package com.springbootsandbox.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoGreetingController {

    @GetMapping("/")
    public String helloWorld()
    {
        return "Hello world!";
    }
}
