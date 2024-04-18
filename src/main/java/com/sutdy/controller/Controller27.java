package com.sutdy.controller;


import com.sutdy.domain.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/main27")
public class Controller27 {

    @Autowired
    private DataSource ds;

    @GetMapping("/sub1")
    public String sub1(Integer page, Model model) throws Exception {

        if (page == null) {
            page = 1;
        }

        int offset = (page - 1) * 10;

        String sql = """
                select *
                from Customers
                order by CustomerID
                limit ?, 10
                """;

        Connection conn = ds.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, offset);
        ResultSet rs = pstmt.executeQuery();

        List<Customers> list = new ArrayList<>();

        try (rs; pstmt; conn;) {
            while (rs.next()) {
                Customers customer = new Customers();
                customer.setCustomerId(rs.getString(1));
                customer.setCustomerName(rs.getString(2));
                customer.setContactName(rs.getString(3));
                customer.setAddress(rs.getString(4));
                customer.setCity(rs.getString(5));
                customer.setPostalCode(rs.getString(6));
                customer.setCountry(rs.getString(7));

                list.add(customer);
            }
        }
        model.addAttribute("list", list);


        return "main27/sub1";
    }
}
