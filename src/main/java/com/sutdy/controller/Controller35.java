package com.sutdy.controller;

import com.sutdy.mapper.Mapper05;
import com.sutdy.service.Service01;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/main35")
@RequiredArgsConstructor
public class Controller35 {

//    @Autowired
//    private final Mapper05 mapper;

    @Autowired
    private final Service01 service;

    //해당월의 직원별 매출액 조회
    // /main35/sub1?year=1997&month=7
    @GetMapping("/sub1")
    public void method1(Model model, Integer year, Integer month) {


        List<Mapper05.EmployeeIncome> list = service.selectIncomeList(year, month);

        list.forEach(System.out::println);

        model.addAttribute("list", list);
        model.addAttribute("year", year);
        model.addAttribute("month", month);
    }

    //해당 월의 고객별 구매금액 조회(구매금액이 높은순)
    //main35/sub2?year=1996&month=7
    @GetMapping("/sub2")
    public void method2(Integer year, Integer month, Model model) {

        List<Mapper05.CustomerList> list = service.selectMonthPrice(year, month);

        model.addAttribute("list", list);
        model.addAttribute("year", year);
        model.addAttribute("month", month);

    }
}
