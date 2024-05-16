package com.sutdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/main43")
public class Controller43 {

    @GetMapping("/sub1")
    @ResponseBody
    public String method1() {

        return "어떤 데이터";
    }
}
