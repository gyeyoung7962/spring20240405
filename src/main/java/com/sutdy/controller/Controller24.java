package com.sutdy.controller;


import com.sutdy.domain.Bean;
import com.sutdy.domain.MyBean242;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/main24")
public class Controller24 {

    @Autowired
    private DataSource ds;

    @GetMapping("/sub1")
    public void method1(Model model) throws Exception {

        String sql = """
                select FirstName, LastName from Employees
                """;

        Connection conn = ds.getConnection();

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);
        List<Bean> list = new ArrayList<>();

        try (conn; stmt; rs;) {


            while (rs.next()) {

                Bean bean = new Bean();
                bean.setFirstName(rs.getString(1));
                bean.setLastName(rs.getString(2));

                list.add(bean);
            }
        }

        model.addAttribute("list", list);
    }

    @GetMapping("/sub2")
    public void method2(Model model) throws Exception {

        String sql = """
                select CustomerName, City, Country from Customers
                """;

        Connection conn = ds.getConnection();

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        List<MyBean242> list = new ArrayList<>();


        try (conn; stmt; rs;) {


            while (rs.next()) {

                MyBean242 bean = new MyBean242();
                bean.setCustomerName(rs.getString(1));
                bean.setCity(rs.getString(2));
                bean.setCountry(rs.getString(3));

                list.add(bean);
            }
        }
        model.addAttribute("list", list);
    }

    @GetMapping("/sub3")
    public void sub3(Model model) throws Exception {

        String sql = """
                select distinct country from Customers
                """;

        Connection conn = ds.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        List<MyBean242> list = new ArrayList<>();

        try (conn; stmt; rs;) {


            while (rs.next()) {
                MyBean242 bean = new MyBean242();

                bean.setCountry(rs.getString(1));
                list.add(bean);
            }

        }

        model.addAttribute("list", list);

    }

}
