package com.sutdy.controller;


import com.sutdy.service.Service02;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main36")
public class Controller36 {

    private final Service02 service;

    @GetMapping("/sub1")
    public void sub1() {
        service.transferMoney1();
    }

    @GetMapping("/sub2")
    public void sub2() {
        service.transferMoney2();
    }

    @GetMapping("/sub3")
    public void sub3() throws Exception {

        //check exception 은 rollback 안됨
        service.transferMoney3();
    }

    @GetMapping("/sub4")
    public void sub4() throws Exception {

        //check exception 은 rollback 안됨
        service.transferMoney4();
    }

    @GetMapping("/sub5")
    public void sub5() {

        //check exception 은 rollback 안됨
        service.transferMoney5();
    }
}
