package com.sutdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controller41 {

    @GetMapping("/api/somemurl")
    public void method1() {
        System.out.println("Controller41.method1");
    }

    @PostMapping("/api/someurl")
    public void method2() {
        System.out.println("Controller41.method2");
    }

}
