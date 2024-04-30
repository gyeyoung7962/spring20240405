package com.sutdy.controller;


import com.sutdy.service.Service03;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main37")
public class Controller37 {

    private final Service03 service;

    @GetMapping("/sub1")
    public void method1() {
        service.insertData();
    }

    @GetMapping("/sub2")
    public void method2() {
        service.insertData2();
    }
}
