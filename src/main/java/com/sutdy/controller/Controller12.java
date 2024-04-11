package com.sutdy.controller;

import com.sutdy.domain.MyBean121;
import com.sutdy.domain.MyBean122;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main12")
public class Controller12 {

    @RequestMapping("/sub1")
    public void method1(Model model) {

        model.addAttribute("age", 30);
//        model.addAttribute("products", List.of());
        model.addAttribute("products", List.of("Apple", "Banana"));

        model.addAttribute("member", Map.of("country", "korea", "age", 30));
//        model.addAttribute("member", Map.of("country", "korea", "age", 1);
//        model.addAttribute("member", Map.of("country", "us", "age", 30));
//        model.addAttribute("member", Map.of("country", "us", "age", 15));
    }

    @RequestMapping("/sub2")
    public void method2(Model model) {

        model.addAttribute("age", 3);
//        model.addAttribute("age", 13);
//        model.addAttribute("age", 23);
//        model.addAttribute("age", 33);
    }

    @RequestMapping("/sub3")
    public void method3(Model model) {

        model.addAttribute("dan", 5);

    }

    @RequestMapping("/sub4")
    public void method4(Model model) {
        model.addAttribute("myList", List.of("java", "css", "react"));
        model.addAttribute("foods", List.of("피자", "햄버거", "찌개", "돈까스"));
        model.addAttribute("myMap", Map.of("son", "london", "lee", "paris", "kim", "munchen"));
        model.addAttribute("cars", Map.of("tesla", "usa", "kia", "korea", "volvo", "sweden"));
        model.addAttribute("myList2", List.of("aa", "bb", "cc"));
        model.addAttribute("myMap2", Map.of("aaa", "bbb", "ccc", "ddd"));
    }

    @RequestMapping("/sub5")
    public void method5(Model model) {
        model.addAttribute("myList", List.of("java", "css", "react"));
    }

    @RequestMapping("/sub6")
    public void method6(Model model) {

        MyBean121 e1 = new MyBean121("모하비", "kia", 3000, "한국");
        MyBean121 e2 = new MyBean121("모델x", "tesla", 4000, "미국");
        MyBean121 e3 = new MyBean121("xc90", "volvo", 5000, "스웨덴");
        MyBean121 e4 = new MyBean121("x5", "bmw", 7000, "독일");

        model.addAttribute("cars", List.of(e1, e2, e3, e4));
    }

    @RequestMapping("/sub7")
    public void method7(Model model) {
        MyBean122 e1 = new MyBean122("손흥민", "토트넘", "한국", "축구", List.of("공격수"));
        MyBean122 e2 = new MyBean122("김하성", "센디에이고", "한국", "야구", List.of("유격수", "2루수"));
        MyBean122 e3 = new MyBean122("오타니", "LA", "일본", "야구", List.of("투수", "지명타자"));
        MyBean122 e4 = new MyBean122("이강인", "파리", "한국", "축구", List.of("미드필더"));
        MyBean122 e5 = new MyBean122("김민재", "뮌헨", "한국", "축구", List.of("수비수"));


        model.addAttribute("playerList", List.of(e1, e2, e3, e4, e5));
    }
}
