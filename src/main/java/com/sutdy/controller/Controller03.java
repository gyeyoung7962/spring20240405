package com.sutdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main3")
public class Controller03 {

    @RequestMapping("sub1")
    public void method1() {
        System.out.println("Controller03.method1");
    }

    @RequestMapping("sub2")
    public void method2(@RequestParam("name") String name) {
        System.out.println("Controller03.method2");

        System.out.println("name" + name);
    }

    @RequestMapping(value = "sub3", params = "name")
    public void method3() {

        System.out.println("Controller03.method3");
    }

    @RequestMapping(value = "sub3", params = {"name", "age"})
    public void method4() {
        System.out.println("Controller03.method4");
    }


    @RequestMapping(value = "sub3", params = {"address", "city"})
    public void method5() {
        System.out.println("Controller03.method5");
    }

    @RequestMapping(value = "sub3", params = {"country", "city"})
    public void method6() {
        System.out.println("Controller03.method6");
    }

}
