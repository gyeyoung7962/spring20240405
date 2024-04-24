package com.sutdy.controller;


import com.sutdy.domain.MyBean331;
import com.sutdy.domain.MyBean332;
import com.sutdy.domain.MyBean333;
import com.sutdy.mapper.Mapper04;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/main34")
@RequiredArgsConstructor
public class Controller34 {

    private final Mapper04 mapper;

    @GetMapping("/sub1")
    public void method1() {
        List<MyBean331> obj = mapper.select1();

        obj.forEach(System.out::println);
    }

    @GetMapping("/sub2")
    public void method2() {
        List<MyBean332> obj = mapper.select2();
        obj.forEach(System.out::println);
    }

    @GetMapping("/sub3")
    public void method3() {
        List<MyBean333> obj = mapper.select3();

        obj.forEach(System.out::println);
    }

    @GetMapping("/sub4")
    public void method4() {
        mapper.insert1("hello", "54321", "876.54", "2024-01-01", "2024-01-01 14:14:14");
    }

    @GetMapping("/sub5")
    public void method5() {
        String strVal = "hello mybatis";
        Integer intVal = 7890;
        Double doubleVal = 3.14;
        LocalDate dateVal = LocalDate.parse("1988-01-08");
        LocalDateTime dateTimeVal = LocalDateTime.parse("1977-07-07T12:14:14");
        mapper.insert2(strVal, intVal, doubleVal, dateVal, dateTimeVal);
    }

    @GetMapping("/sub6")
    public void method6() {
        String title = "자바";
        String name = "손흥민";
        Integer age = 20;
        Double price = 50.32;
        LocalDate published = LocalDate.parse("2024-01-01");
        LocalDateTime inserted = LocalDateTime.parse("2024-01-01T11:00:00");

//        mapper.insert3(title, name, age, price, published, inserted);
    }

    @GetMapping("/sub7")
    public void method7() {
        MyBean332 obj = new MyBean332();
        obj.setStringCol("hello ");
        obj.setIntCol(7890);
        obj.setDateCol(LocalDate.parse("2020-09-09"));
        obj.setDateTimeCol(LocalDateTime.parse("2020-09-09T11:13:25"));
        obj.setDecCol(78.90);

        mapper.insert4(obj);
    }

    @GetMapping("/sub8")
    public void method8() {
        MyBean333 obj = new MyBean333();
        obj.setTitle("오라클");
        obj.setAge(20);
        obj.setPrice(15.1);
        obj.setInserted(LocalDate.parse("2020-01-01"));
        obj.setPublished(LocalDateTime.parse("2020-01-01T10:11:31"));

        mapper.insert5(obj);
    }

    @GetMapping("/sub9")
    public void select9(Model model) {
        List<MyBean332> list = mapper.select2();
        model.addAttribute("list", list);
    }

    @PostMapping("/sub9/insert")
    public String insert9(MyBean332 myBean332, RedirectAttributes rttr) {

        int i = mapper.insert222(myBean332);

        if (i > 0) {
            rttr.addFlashAttribute("msg", "가입완료");
        } else {
            rttr.addFlashAttribute("msg", "가입 실패");
        }
        return "redirect:/main34/sub9";
    }

    @GetMapping("/sub12")
    public void select12(Model model) {


        model.addAttribute("list", mapper.select3());
    }

    @PostMapping("/sub12/insert")
    public String insert12(MyBean333 myBean333, RedirectAttributes rttr) {

        int i = mapper.insert3(myBean333);

        if (i > 0) {
            rttr.addFlashAttribute("msg", "가입완료");
        } else {
            rttr.addFlashAttribute("msg", "가입 실패");
        }
        return "redirect:/main34/sub12";
    }

    @PostMapping("/sub12/search")
    public String search(@RequestParam("keyword") String keyword, RedirectAttributes rttr, Model model) {
        keyword = "%" + keyword + "%";
        List<MyBean333> list = mapper.search(keyword);
        System.out.println("11111");
        if (!list.isEmpty()) {
            list.forEach(System.out::println);
            model.addAttribute("list", list);
            return "/main34/sub12";
        } else {
            System.out.println("22222");
            rttr.addFlashAttribute("add", "데이터없음");

        }
        return "redirect:/main34/sub12";
    }
}
