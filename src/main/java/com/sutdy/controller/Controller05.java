package com.sutdy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main5")
public class Controller05 {

    @RequestMapping("sub1")
    public void method1(@RequestParam("city") String param) {

        System.out.println(param + "검색 로직");
    }

    @RequestMapping("sub2")
    public void method2(@RequestParam("address") String addr) {

        System.out.println(addr + "로 가는 경로 탐색");
    }

    @RequestMapping("sub3")
    public void method3(@RequestParam("age") int age) {
        if (age < 18) {

            System.out.println("청소년 관련정보 출력");
        } else if (age < 35) {
            System.out.println("청년 관련 정보 출력");
        } else if (age < 65) {
            System.out.println("중장년 관련 정보 출력");
        } else {
            System.out.println("노인 관련 정보 출력");
        }

    }

    @RequestMapping("sub4")
    public void method4(@RequestParam("height") double height) {


        if (height < 18) {
            System.out.println("청소년 관련정보 출력");
        } else if (height < 35) {
            System.out.println("청년 관련 정보 출력");
        } else if (height < 65) {
            System.out.println("중장년 관련 정보 출력");
        } else {
            System.out.println("노인 관련 정보 출력");
        }

    }
}
