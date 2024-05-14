package com.sutdy.controller;

import com.sutdy.service.Service05;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class Controller40 {

    private final Service05 service;

    @GetMapping("/api/customer")
    @ResponseBody
    public String customerName(Integer id) {
        return service.getCustomerName(id);
    }
}
