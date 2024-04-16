package com.sutdy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/main23")
public class Controller23 {

    @RequestMapping("/sub1")
    public void sub1(Model model) throws Exception {

        String query = """
                SELECT FirstName from Employees
                """;

        /*
        1. db와 연결
        2. 실행준비
        3.쿼리 실행
        4.결과 가공
        5.자원 닫기
         */

        //1. db와 연결


        String url = "jdbc:mariadb://localhost:3306/w3schools";
        String user = "root";
        String password = "1234";

        Connection conn = DriverManager.getConnection(url, user, password);
        //2. 실행준비
        Statement stmt = conn.createStatement();

        //3.쿼리 실행
        ResultSet rs = stmt.executeQuery(query);

        List<String> list = new ArrayList<>();
        try (rs; stmt; conn) {

            while (rs.next()) { //각 행탐색
                String name = rs.getString(1); //첫번째 컬럼의 값 얻기
                list.add(name);
            }
        }
        model.addAttribute("list", list);
    }

    @GetMapping("/sub2")
    public void method2(Model model) throws Exception {

        String sql = """
                select CustomerName
                from Customers
                """;

        String url = "jdbc:mariadb://localhost:3306/w3schools";
        String user = "root";
        String pw = "1234";

        Connection conn = DriverManager.getConnection(url, user, pw);

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        List<String> list = new ArrayList<>();

        try (conn; stmt; rs;) {

            while (rs.next()) {
                String name = rs.getString(1);

                list.add(name);
            }
        }

        model.addAttribute("list", list);
    }
}
