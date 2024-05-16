package com.sutdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller41 {

    @GetMapping("/api/someurl")
    public void method1() {
        System.out.println("Controller41.method1");
    }

    @PostMapping("/api/someurl")
    public void method2() {
        System.out.println("Controller41.method2");
    }

    @GetMapping("/api/someurl2")
    public void method3() {
        System.out.println("Controller41.method3");
    }

    @PostMapping("/api/someurl2")
    public void method4() {
        System.out.println("Controller41.method4");
    }

    @GetMapping("/api/someurl3")
    public void getMethod5(@RequestParam("name") String name, @RequestParam("id") Integer id) {

        System.out.println("Controller41.getMethod5");
        System.out.println("id = " + id);
        System.out.println("name = " + name);
    }

    @PostMapping("/api/someurl3")
    public void postMethod6(@RequestParam("id") Integer id,
                            @RequestParam("city") String city,
                            @RequestParam("country") String country) {

        System.out.println("id = " + id);
        System.out.println("city = " + city);
        System.out.println("country = " + country);
    }

    @GetMapping("/api/someurl4")
    public void getMethod7(@RequestParam("id") Integer id,
                           @RequestParam("name") String name,
                           @RequestParam("goods") String goods) {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("goods = " + goods);
    }

    @PostMapping("/api/someurl4")
    public void postMethod7(@RequestParam("id") Integer id,
                            @RequestParam("name") String name,
                            @RequestParam("goods") String goods) {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("goods = " + goods);
    }
}
