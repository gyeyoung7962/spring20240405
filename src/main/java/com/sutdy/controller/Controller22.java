package com.sutdy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/main22")
public class Controller22 {

    @GetMapping("/sub1")
    public String sub1() {

        return "main22/sub1";
    }

    @GetMapping("/sub2")
    public String sub2() {

        //redirect:브라우저는 302응답을 받으면 location 헤더에있는 값으로 다시 요청을 보냄
        return "redirect:/main22/sub1";
    }

    @GetMapping("/sub3")
    public void sub3() {

        //loginform
    }

    @PostMapping("/sub4")
    public String method4(String id, String password, RedirectAttributes rttr) {

        boolean ok = id.equals(password);

        if (ok) {

            //로그인 성공시
            //성공후 보여주는 페이지로 이동
            //return redirect

            rttr.addAttribute("type", "login");
            return "redirect:/main22/sub5";
        } else {

            //로그인 실패시
            //로그인 form 있는 페이지로 이동
            //return redirect

            rttr.addAttribute("type", "fail");
            return "redirect:/main22/sub3";
        }
    }

    @GetMapping("/sub5")
    public void sub5() {

    }

    @GetMapping("/sub6")
    public void method6() {


    }

    @PostMapping("/sub7")
    public String method7(String id, String password, RedirectAttributes rttr) {
        boolean ok = id.equals(password);


        if (ok) {
            rttr.addAttribute("type", "로그인성공");
            return "redirect:/main22/sub8";
        } else {
            rttr.addAttribute("type", "로그인실패");
            return "redirect:/main22/sub6";
        }

    }

    @GetMapping("/sub8")
    public void sub8() {

    }

    @GetMapping("/sub9")
    public String method9(RedirectAttributes rttr) {

        if (Math.random() < 0.5) {
            rttr.addAttribute("condition", "ok");
        } else {
            rttr.addAttribute("condition", "fail");
        }


        return "redirect:/main22/sub10";
    }

    @GetMapping("/sub10")
    public void method10() {

    }

    @GetMapping("/sub11")
    public String method11(RedirectAttributes rttr) {

        rttr.addAttribute("type", "soccer");

        rttr.addFlashAttribute("attr1", List.of("car", "food", "phone"));
        return "redirect:/main22/sub12";
    }

    @GetMapping("/sub12")
    public void method12(@ModelAttribute("attr1") List<String> list) {

        System.out.println("attr1 = " + list);

    }

    @GetMapping("/sub13")
    public void method13() {

    }

    @PostMapping("/sub14")
    public String method14(String id, String password, RedirectAttributes rttr) {

        boolean ok = id.equals(password);

        if (ok) {
            //로그인성공시 return "redirect:/main22/sub15"

            rttr.addFlashAttribute("message", "로그인");
            return "redirect:/main22/sub15";
        } else {
            //로그인 실패시
            //로그인 페이지로 redirect

            rttr.addFlashAttribute("message", "아이디와 패스워드를 확인해주세요");

            return "redirect:/main22/sub13";
        }
    }


    @GetMapping("/sub15")
    public void method15() {

    }
}
