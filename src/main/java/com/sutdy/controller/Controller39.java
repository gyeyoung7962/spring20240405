package com.sutdy.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller39 {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/path1")
    @PreAuthorize("isAuthenticated()") //아무나 접근가능
    public void path1() {
        System.out.println("Controller39.path1");
    }

    @GetMapping("/path2")
    @PreAuthorize("hasAuthority('user')")  //접근 권한 설정
    public void path2() {
        System.out.println("유저권한이면 실행 가능");
    }

    @GetMapping("/path3")
    @PreAuthorize("hasAuthority('admin')")
    public void path3() {
        System.out.println("어드민권한이면 실핼가능");
    }

    @GetMapping("/path4")
    public void path4() {

    }

}
