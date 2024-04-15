package com.sutdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/main20")
public class Controller20 {

    @RequestMapping("/sub1")
    public void sub1() {
    }

    @RequestMapping("/sub2")
    public void sub2() {
    }

    @RequestMapping("/sub3")
    public void sub3() {

    }

    @RequestMapping("/sub4")
    public void sub4(String name, String address, Model model, String age, String birth, String city, String title, String content, String[] foods, String type, String phone, String[] book, String id, String password, String describe) {


        model.addAttribute("name", name);
        model.addAttribute("address", address);
        model.addAttribute("age", age);
        model.addAttribute("birth", birth);
        model.addAttribute("city", city);
        model.addAttribute("title", title);
        model.addAttribute("content", content);
        model.addAttribute("foods", Arrays.toString(foods));
        model.addAttribute("type", type);
        model.addAttribute("phone", phone);
        model.addAttribute("book", Arrays.toString(book));
        model.addAttribute("id", id);
        model.addAttribute("password", password);
        model.addAttribute("describe", describe);


    }

    @RequestMapping("/sub5")
    public void sub5() {


    }


}
