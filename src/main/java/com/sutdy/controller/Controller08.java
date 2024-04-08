package com.sutdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main8")
public class Controller08 {

    @RequestMapping("/sub1")
    public void method1(Model model) {

        model.addAttribute("name", "value");
    }

    @RequestMapping("/sub2")
    public void method2(Model model) {
        model.addAttribute("city", "서울");
        model.addAttribute("address", "신촌");
    }

    @RequestMapping("/sub3")
    public void method3(Model model) {
        model.addAttribute("name", "aaa");
        model.addAttribute("age", 20);
    }

    @RequestMapping("/sub4")
    public void method4(Model model) {

        model.addAttribute("car", new String[]{"tesla", "kia", "hyundai"});
    }

    @RequestMapping("/sub5")
    public void method5(Model model) {
        model.addAttribute("cities", new String[]{"서울", "대구", "부산"});
        model.addAttribute("countries", new String[]{"한국", "미국", "케냐"});
    }

    @RequestMapping("/sub6")
    public void method6(Model model) {
        List<String> data = List.of("java", "css", "html", "jsp");
        model.addAttribute("data", data);
    }

    @RequestMapping("/sub7")
    public void method7(Model model) {
        List<String> data = List.of("\uD83D\uDE42", "\uD83D\uDE04", "\uD83D\uDE0A");
        model.addAttribute("data", data);

        List<Integer> numbers = List.of(10, 5, 0);
        model.addAttribute("yourList", numbers);
    }

    @RequestMapping("/sub8")
    public void method8(Model model) {
        List<Double> list = List.of(500.0, 3.14);
        List<String> list2 = List.of("서울", "런던", "뉴욕");

        model.addAttribute("list", list);
        model.addAttribute("list2", list2);
    }

    @RequestMapping("/sub9")
    public void method9(Model model) {
        Map<String, String> map = new HashMap<>();

        map.put("name", "흥민");
        map.put("age", "30");
        map.put("address", "런던");

        model.addAttribute("myMap", map);
    }

    @RequestMapping("/sub10")
    public void method10(Model model) {

        Map<String, String> names = Map.of("son", "토트넘", "lee", "파리", "kim", "뮌헨");
        model.addAttribute("names", names);

        Map<String, String> others = Map.of("손흥민", "런던");
        model.addAttribute("others", others);

    }
}
