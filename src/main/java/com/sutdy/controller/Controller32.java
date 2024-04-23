package com.sutdy.controller;

import com.sutdy.domain.Customers;
import com.sutdy.domain.Employees;
import com.sutdy.domain.Product;
import com.sutdy.mapper.Mapper02;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/main32")
@RequiredArgsConstructor
public class Controller32 {

    private final Mapper02 mapper;

    @GetMapping("/sub1")
    public void method1() {
        String now = mapper.selectNow();
        System.out.println("now = " + now);
    }

    @GetMapping("/sub2")
    public void method2() {
        Customers customers = mapper.selectOneCustomer();

        System.out.println(customers);
    }

    @GetMapping("/sub3")
    public void method3() {
        Customers customers = mapper.selectOneCustomer2();
        System.out.println(customers);
    }

    @GetMapping("/sub4")
    public void method4() {
        Customers customers = mapper.selectOneCustomer3();
        System.out.println(customers);
    }

    @GetMapping("/sub5")
    public void method5() {
        Employees employees = mapper.selectOneEmployee1();
        System.out.println(employees);
    }

    @GetMapping("/sub6")
    public void method6() {
        Employees employees = mapper.selectOneEmployee2("1");
        System.out.println(employees);
    }

    @GetMapping("/sub7")
    public void method7(String id) {
        Employees employees = mapper.selectOneEmployee2(id);
        System.out.println(employees);
    }

    @GetMapping("/sub8")
    public void method8(Integer id) {
        Customers c = mapper.selectOneCustomer4(id);
        System.out.println("c = " + c);
    }

    @GetMapping("/sub9")
    public void method9() {
        List<Customers> customers = mapper.selectAllCustomer1();

        System.out.println(customers.size());
    }

    @GetMapping("/sub10")
    public void method10() {
        List<Employees> employees = mapper.selectAllEmployees();

        for (Employees employee : employees) {

            System.out.println(employee);
        }
    }

    @GetMapping("/sub11")
    public void method11() {
        List<Customers> list = mapper.selectCustomersByCountry("usa", "uk");

        list.forEach(System.out::println);
    }

    @GetMapping("/sub12")
    public void method12(double price1, double price2) {
        List<Product> list = mapper.selectProductByPrice(price1, price2);

        list.forEach(System.out::println);
    }


}
