package com.sutdy.controller;


import com.sutdy.domain.Customers;
import com.sutdy.domain.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

@Controller
@RequestMapping("/main28")
public class Controller28 {

    @Autowired
    private DataSource ds;

    @GetMapping("/sub1")
    public void sub1() {

    }

    @PostMapping("/sub1")
    public String sub1(Customers customers, RedirectAttributes rttr) throws Exception {

        System.out.println("customers = " + customers);

        String sql = """
                insert into Customers(customerName, contactName, address, city, postalCode, country)
                values (?, ?, ?, ?, ?, ?);
                """;

        Connection conn = ds.getConnection();

        PreparedStatement pstmt = conn.prepareStatement(sql);

        try (pstmt; conn) {

            pstmt.setString(1, customers.getCustomerName());
            pstmt.setString(2, customers.getContactName());
            pstmt.setString(3, customers.getAddress());
            pstmt.setString(4, customers.getCity());
            pstmt.setString(5, customers.getPostalCode());
            pstmt.setString(6, customers.getCountry());

            int rowCount = pstmt.executeUpdate();
            if (rowCount == 1) {
                rttr.addFlashAttribute("message", "새 고객이 등록되었습니다");
            }
        }
        System.out.println("새 데이터 입력하는 일");

        return "redirect:/main28/sub1";
    }

    @GetMapping("/sub2")
    public void sub2() {

    }

    @PostMapping("/sub2")
    public String sub2(Employees employees, RedirectAttributes rttr) throws Exception {

        System.out.println("employees = " + employees);

        String sql = """
                insert into Employees(lastName, firstName, birthDate, photo, notes)
                values (?, ?, ?, ?, ?)
                """;

        Connection conn = ds.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, employees.getLastName());
        pstmt.setString(2, employees.getFirstName());
        pstmt.setString(3, employees.getBirthDate());
        pstmt.setString(4, employees.getPhoto());
        pstmt.setString(5, employees.getNotes());

        int rowChk = pstmt.executeUpdate();

        if (rowChk == 1) {
            rttr.addFlashAttribute("message", "가입");
        }

        return "redirect:/main28/sub2";
    }
}