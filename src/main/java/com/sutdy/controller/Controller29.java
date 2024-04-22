package com.sutdy.controller;


import com.sutdy.domain.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/main29")
public class Controller29 {

    @Autowired
    private DataSource ds;

    @GetMapping("/sub1")
    public void sub1(@RequestParam(defaultValue = "1", name = "page") Integer page, Model model) throws SQLException {

        if (page <= 0 || page == null) {
            page = 1;
        }
        Connection conn = ds.getConnection();

        String countSql = """
                SELECT COUNT(*)
                FROM Customers
                 """;

        Statement stmt = conn.createStatement();
        ResultSet rs1 = stmt.executeQuery(countSql);

        int totalCount = 0;

        try (rs1; stmt;) {
            if (rs1.next()) {
                totalCount = rs1.getInt(1);
            }
        }

        //현재 페이지가 23페이지일 경우 21페이지가 처음 페이지로 보여야한다
        //현재 page의 끝번호
        int currentEndPageNumber = (((page - 1) / 10) + 1) * 10;

        //현재 page의 시작번호
        int currentStartPageNumber = ((page - 1) / 10) * 10 + 1;


        //다음페이지 이전페이지
        int prevPage = currentStartPageNumber - 10;
        int nextPage = currentStartPageNumber + 10;


        int endPage = totalCount % 10 == 0 ? totalCount / 10 : totalCount / 10 + 1;


        if (endPage < currentEndPageNumber) {
            currentEndPageNumber = endPage;
        }


        String listSql = """
                SELECT *
                FROM Customers
                ORDER BY CustomerID
                LIMIT ?, 10
                """;


        //물음표 안의 들어갈 데이터를 보여줄 값 설정 ex) 1page = > 1-1 *10 =0 1~ 10번까지 데이터 출력
        int offset = (page - 1) * 10;

        PreparedStatement pstmt = conn.prepareStatement(listSql);
        pstmt.setInt(1, offset);

        ResultSet rs = pstmt.executeQuery();

        List<Customers> customerList = new ArrayList<>();


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

                customerList.add(customer);
            }
        }
        model.addAttribute("customerList", customerList);
        model.addAttribute("currentStart", currentStartPageNumber);
        model.addAttribute("currentEnd", currentEndPageNumber);
        model.addAttribute("prevPage", prevPage);
        model.addAttribute("nextPage", nextPage);
        model.addAttribute("currentPage", page);
        model.addAttribute("endPage", endPage);

    }
}
