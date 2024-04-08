package com.sutdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequestMapping("/main6")
public class Controller06 {

    @RequestMapping("/sub1")
    public void method1() {
        System.out.println("Controller06.method1");
    }

    @RequestMapping("/sub2")
    public void method2(@RequestParam(value = "abc", required = true) String param1, @RequestParam(value = "qwe", required = true) Integer param2) {
        System.out.println("Controller06.method2");
        System.out.println("param1 = " + param1);
        System.out.println("param2 = " + param2);
    }

    @RequestMapping("/sub3")
    public void method3(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "age", required = false) Integer age) {

        System.out.println("Controller06.method3");
        if (name == null) {

            System.out.println("age = " + age);
        } else if (age == null) {
            System.out.println("name = " + name);
        } else {
            System.out.println("name = " + name);
            System.out.println("age = " + age);
        }
    }

    @RequestMapping("/sub4")
    public void method4(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age) {

        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @RequestMapping("/sub5")
    public void method5(@RequestParam(required = false) String address, @RequestParam(required = false) String city) {

        System.out.println("address = " + address);
        System.out.println("city = " + city);
    }

    @RequestMapping("/sub6")
    public void method6(String address, String city) {  //RequestParam 안쓰면 required false로 나온다
        System.out.println("address = " + address);
        System.out.println("city = " + city);
    }


    //메소드 아규먼트 타입이 기본타입(Wrapper포함), String또는 String의 배열이면 @RequestParam으로 간주됨
    @RequestMapping("/sub7")
    public void method7(String name, Integer age) {

        System.out.println("name = " + name);
        System.out.println("age = " + age);

    }

    @RequestMapping("/sub8")
    public void method8(String name, String[] address) {

        System.out.println("name = " + name);
        System.out.println("address = " + Arrays.toString(address));

    }

    @RequestMapping("/sub9")
    public void method9(String[] age, String[] city) {


        System.out.println("age = " + Arrays.toString(age));
        System.out.println("city = " + Arrays.toString(city));
    }

}
