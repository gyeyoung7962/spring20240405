package com.sutdy.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

@Controller
@RequestMapping("main4")
public class Controller04 {

    @RequestMapping("sub1")
    public void sub1(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String name = req.getParameter("name");
        String city = req.getParameter("city");

        PrintWriter writer = resp.getWriter();

        writer.print("name" + name + ", city" + city);


        System.out.println("Controller04.sub1");
    }


    @RequestMapping("sub2")
    public void sub2(WebRequest req) {

        Iterator<String> names = req.getParameterNames();

        while (names.hasNext()) {

            String name = names.next();
            String value = req.getParameter(name);
            System.out.print(name + " " + value);
        }
    }

    @RequestMapping("sub3")
    public void sub3(WebRequest req) {

        String value = req.getParameter("query");

        System.out.println(value + " 검색하기 로직 실행");
        System.out.println("검색결과 응답하기");
    }

    @RequestMapping("sub4")
    public void sub4(HttpServletRequest req) {

        String city = req.getParameter("city");

        System.out.println("city=" + city);
    }

    @RequestMapping("sub5")
    public void sub5(WebRequest req) {

        int age = Integer.parseInt(req.getParameter("age"));

        if (age < 13) {
            System.out.println("유아용 정보 검색");
        } else if (age > 13 && age < 19) {
            System.out.println("청소년 검색");
        } else {
            System.out.println("성인정보 검색");
        }
    }

    @RequestMapping("sub6")
    public void sub6(WebRequest req) {
        double weight = Integer.parseInt(req.getParameter("weight"));

        if (weight < 50) {
            System.out.println("저체중");
        } else if (weight < 90) {
            System.out.println("보통");
        } else {
            System.out.println("과체중");
        }
    }
}
