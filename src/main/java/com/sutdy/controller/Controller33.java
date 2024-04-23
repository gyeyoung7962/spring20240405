package com.sutdy.controller;

import com.sutdy.domain.Customers;
import com.sutdy.domain.Employees;
import com.sutdy.mapper.Mapper02;
import com.sutdy.mapper.Mapper03;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main33")
public class Controller33 {

    private final Mapper03 mapper;
    private final Mapper02 mapper2;

    @GetMapping("/sub1")
    public void method1(Integer id) {
        int rowCnt = mapper.deleteOneCustomerById(id);

        if (rowCnt > 0) {
            System.out.println("삭제성공");
        } else {
            System.out.println("삭제실패");
        }
    }

    @GetMapping("/sub2")
    public void method2(@ModelAttribute Customers customers) {
        int i = mapper.insertCustomer(customers);

        if (i > 0) {
            System.out.println("가입완료");
        } else {
            System.out.println("가입안됨");
        }
    }

    @GetMapping("/sub3")
    public void method3() {


    }

    @PostMapping("/sub3/insert")
    public String method3(@ModelAttribute Employees employees, RedirectAttributes rttr) {

        int i = mapper.insertEmployees(employees);

        if (i > 0) {
            rttr.addFlashAttribute("msg", "가입완료");
        } else {
            rttr.addFlashAttribute("msg", "가입실패");
        }

        return "redirect:/main33/sub3";
    }

    @PostMapping("/sub3/select")
    public String method3(@RequestParam("employeeId") String employeeId, RedirectAttributes rttr) {

        System.out.println("조회된 번호:" + employeeId);

        Employees employee = mapper2.selectOneEmployee2(employeeId);

        System.out.println("========employee====");
        System.out.println(employee.toString());

        if (employee != null) {
            rttr.addFlashAttribute("msg", "조회성공");
        } else {
            rttr.addFlashAttribute("msg", "조회된 데이터가 없습니다");
        }

        rttr.addFlashAttribute("list", employee);
//        rttr.addFlashAttribute("employeeId", employee.getEmployeeId());

        return "redirect:/main33/sub3";


    }

    @PostMapping("/sub3/update")
    public String method3Update(Employees employees, RedirectAttributes rttr) {

        System.out.println("=====id===" + employees.getEmployeeId());


        int i = mapper2.updateEmployeebyId(employees);

        if (i > 0) {
            rttr.addFlashAttribute("msg", "수정성공");
        } else {
            rttr.addFlashAttribute("msg", "수정 실패");
        }

        return "redirect:/main33/sub3";


    }

}
